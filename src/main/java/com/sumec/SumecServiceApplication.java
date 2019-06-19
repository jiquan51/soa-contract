package com.sumec;

import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.sumec.boot.core.annotation.RESTful;
import com.sumec.boot.core.annotation.SumecApp;
import com.sumec.boot.core.application.SumecApplication;
import com.sumec.boot.uaa.properties.TokenBean;
import com.sumec.config.DynamicDataSourceRegister;
import com.sumec.uaa.provider.config.provider.TokenProvider;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

/**
 * 功能描述：添加功能描述.<br/>
 * 
 * #date： 2017年4月6日 下午2:44:01<br/>
 * #author SunTow_J<br/>
 * #since 1.0.0<br/>
 */
@SumecApp
@EnableTransactionManagement // 启注解事务管理
@RESTful
@MapperScan(basePackages = {"com.sumec.*.dao"})
@EnableFeignClients(basePackages = {"com.sumec.api.*.service"})
@EnableCircuitBreaker
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
public class SumecServiceApplication extends WebMvcConfigurerAdapter{
    
    @Inject
    private TokenProvider tokenProvider;
    @Autowired  
    private RestTemplateBuilder builder;
    /**
     * 使用test/** 无需进行身份校验，可以用来做测试接口
     * @return
     */
    @GetMapping("/test/token")
    @ApiOperation(value = "获取token",notes = "获取token",
            authorizations = @Authorization(value = "scope",scopes = @AuthorizationScope(scope = "wechat",description = "")))
    public String abc(){
        TokenBean token = tokenProvider.getToken();
        return token.getAccess_token();
    }
    
    @Bean  
    public RestTemplate restTemplate() {  
        return builder.build();  
    }  
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);

        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setDateFormat(DateUtils.F_YYYY_MM_dd_HH_mm_ss);
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat,
                    SerializerFeature.WriteMapNullValue);
        fastConverter.setFastJsonConfig(fastJsonConfig);

        StringHttpMessageConverter stringConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        stringConverter.setWriteAcceptCharset(false);
        //增加两个优先处理的转换类型.
        converters.add(new ByteArrayHttpMessageConverter());
        converters.add(stringConverter);
        converters.add(fastConverter);
    }
    public static void main(String[] args) throws UnknownHostException {
        SumecApplication.runApp(SumecServiceApplication.class,args );
    }

}
