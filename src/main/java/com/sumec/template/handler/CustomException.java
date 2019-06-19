package com.sumec.template.handler;

import org.springframework.web.client.RestClientException;

public class CustomException extends RestClientException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RestClientException restClientException;
	private String body;

	public RestClientException getRestClientException() {
		return restClientException;
	}

	public void setRestClientException(RestClientException restClientException) {
		this.restClientException = restClientException;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public CustomException(String msg, RestClientException restClientException, String body) {
		super(msg);
		this.restClientException = restClientException;
		this.body = body;
	}

}
