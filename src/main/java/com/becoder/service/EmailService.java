package com.becoder.service;

import com.becoder.model.EmailRequest;

public interface EmailService {

	public Boolean sendEmail(EmailRequest emailRequest) throws Exception;

}
