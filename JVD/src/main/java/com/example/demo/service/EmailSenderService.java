package com.example.demo.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailSenderService {

	@Autowired
	private JavaMailSender mailSender;
	public void sendEmail(String toEmail,
			              String subject,
			               String body) {
		SimpleMailMessage message= new SimpleMailMessage();
		message.setFrom("rroyyadavj@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		mailSender.send(message);
		System.out.println("Email sent ");
	}
	
	public void sendEmailAttachment(String toEmail, String subject, String body, String attachment) throws MessagingException {
	    MimeMessage message = mailSender.createMimeMessage();
	    MimeMessageHelper mimeHelper = new MimeMessageHelper(message, true);
	    mimeHelper.setFrom("rroyyadavj@gmail.com");
	    mimeHelper.setTo(toEmail);
	    mimeHelper.setText(body);
	    mimeHelper.setSubject(subject);
	    FileSystemResource fileSystem = new FileSystemResource(new File(attachment));
	    mimeHelper.addAttachment(fileSystem.getFilename(), fileSystem);
	    mailSender.send(message);
	    System.out.println("Email sent");
	}

}


