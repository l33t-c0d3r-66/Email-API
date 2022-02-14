package com.l33t_c0d3r_66.model;

public class EmailRequest {
    private String fromEmail;
    private String password;
    private String toEmail;
    private String subject;
    private String message;

    public EmailRequest() {
    }

    public EmailRequest(String fromEmail, String password, String toEmail, String subject, String message) {
        this.fromEmail = fromEmail;
        this.password = password;
        this.toEmail = toEmail;
        this.subject = subject;
        this.message = message;
    }

    public String getFromEmail() {
        return this.fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToEmail() {
        return this.toEmail;
    }

    public void setToEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "EmailRequest{fromEmail='" + this.fromEmail + "', password='" + this.password + "', toEmail='" + this.toEmail + "', subject='" + this.subject + "', message='" + this.message + "'}";
    }
}
