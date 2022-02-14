package com.l33t_c0d3r_66.service;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public EmailService() {
    }

    public boolean sendEmail(String fromEmail, String password, String subject, String message, String to) {
        boolean isSend = false;
        String host = "smtp.gmail.com";
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });
        session.setDebug(true);
        MimeMessage mimeMessage = new MimeMessage(session);

        try {
            mimeMessage.setFrom(fromEmail);
            mimeMessage.setRecipients(RecipientType.TO, new InternetAddress[]{new InternetAddress(to)});
            mimeMessage.setSubject(subject);
            mimeMessage.setText(message);
            Transport.send(mimeMessage);
            isSend = true;
        } catch (Exception var12) {
            var12.printStackTrace();
        }

        return isSend;
    }
}
