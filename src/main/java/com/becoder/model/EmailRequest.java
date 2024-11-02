package com.becoder.model;

public class EmailRequest {

	private String title;

	private String subject;

	private String body;

	private String recipentEmail;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getRecipentEmail() {
		return recipentEmail;
	}

	public void setRecipentEmail(String recipentEmail) {
		this.recipentEmail = recipentEmail;
	}

}
