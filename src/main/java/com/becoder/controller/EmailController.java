package com.becoder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.becoder.model.EmailRequest;
import com.becoder.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@PostMapping("/send-email")
	private ResponseEntity<?> sendEmail(@RequestBody EmailRequest emailRequest) {

		try {
			emailService.sendEmail(emailRequest);
			return new ResponseEntity<>("Email Send Sucess", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Email Send Failed !Internal Server Error ", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
