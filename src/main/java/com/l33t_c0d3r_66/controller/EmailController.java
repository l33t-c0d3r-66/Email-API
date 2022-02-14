package com.l33t_c0d3r_66.controller;

import com.l33t_c0d3r_66.model.EmailRequest;
import com.l33t_c0d3r_66.model.EmailResponse;
import com.l33t_c0d3r_66.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EmailController {
    @Autowired
    private EmailService emailService;

    public EmailController() {
    }

    @RequestMapping({"/welcome"})
    public String welcome() {
        return "This is Email API";
    }

    @RequestMapping(
            value = {"/sendemail"},
            method = {RequestMethod.POST}
    )
    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest request) {
        boolean result = this.emailService.sendEmail(request.getFromEmail(), request.getPassword(), request.getSubject(), request.getMessage(), request.getToEmail());
        return result ? ResponseEntity.ok(new EmailResponse("Email Sent Successfully...")) : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new EmailResponse("Couldn't Sent Email"));
    }
}















