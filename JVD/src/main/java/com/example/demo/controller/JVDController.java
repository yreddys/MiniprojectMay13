
package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.JVD;
import com.example.demo.service.EmailSenderService;
import com.example.demo.service.JVDService;
import com.example.demo.service.NotEligiblelException;

@RestController
public class JVDController {

    private final JVDService jvdService;
    private final EmailSenderService emailSenderService;

    @Autowired
    public JVDController(JVDService jvdService, EmailSenderService emailSenderService) {
        this.jvdService = jvdService;
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveData(@RequestBody JVD jvd) throws NotEligiblelException {
        String toEmail = jvd.getEmail();
        String body = "EmailSendingUsingSpring";
        String subject = "Registration Done Successfully";
        emailSenderService.sendEmail(toEmail, body, subject);
        jvdService.savingData(jvd);
        return ResponseEntity.status(HttpStatus.CREATED).body("Saved Successfully your ID is " + jvd.getId());
    }

    @GetMapping("/get")
    public List<JVD> getData() {
        return jvdService.getData();
    }

}























//package com.example.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.JvdApplication;
//import com.example.demo.entity.JVD;
//import com.example.demo.service.EmailSenderService;
//import com.example.demo.service.JVDService;
//import com.example.demo.service.NotEligiblelException;
//
//@RestController
//public class JVDController {
//
//	@Autowired
//	private JVDService service;
//	@Autowired
//	private EmailSenderService service1;
//	
//	@PostMapping("/save")
//	@EventListener(ApplicationReadyEvent.class)
//	public String saveData(@RequestBody JVD jvd) throws NotEligiblelException {
//
//		
//			
//		    String toEmail = jvd.getEmail();
//		    String body = "EmailSendingUsingSpring";
//		    String subject = "Hello H";
//		    service1.sendEmail(toEmail, body, subject);
//		
//		service.savingData(jvd);
//		return "Saved Successfully your ID is "+jvd.getId();
//}
//
//	
//	@GetMapping("/get")
//	public List<JVD> gettingData(){
//		
//	return service.getData();
//
//	
//	}
//	
//	
	



//JVD jvd;
//@EventListener(ApplicationReadyEvent.class)
//public void triggerMail() {
//	
//    String toEmail = jvd.getEmail();
//    String body = "EmailSendingUsingSpring";
//    String subject = "Hello H";
//    service1.sendEmail(toEmail, body, subject);



























