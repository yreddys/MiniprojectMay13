package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.demo.service.EmailSenderService;

@SpringBootApplication
public class JvdApplication {
//	@Autowired
//	private EmailSenderService service;
	public static void main(String[] args) {
		SpringApplication.run(JvdApplication.class, args);
	}


//@EventListener(ApplicationReadyEvent.class)
//public void triggerMail() {
//    String toEmail = "yreddyy211@gmail.com";
//    String body = "EmailSendingUsingSpring";
//    String subject = "Hello H";
//    service.sendEmail(toEmail, body, subject);
}
