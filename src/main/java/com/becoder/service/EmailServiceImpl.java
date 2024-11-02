package com.becoder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.becoder.model.EmailRequest;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender mailSender;

	@Override
	public Boolean sendEmail(EmailRequest emailRequest) throws Exception {

		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setFrom("techlife246@gmail.com", emailRequest.getTitle());
		helper.setTo(emailRequest.getRecipentEmail());
		helper.setSubject(emailRequest.getSubject());
		helper.setText(emailRequest.getBody(), true);
		mailSender.send(message);
		return true;
	}

}
