package com.l33t_c0d3r_66.model;

public class EmailResponse {
    private String token;

    public EmailResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
