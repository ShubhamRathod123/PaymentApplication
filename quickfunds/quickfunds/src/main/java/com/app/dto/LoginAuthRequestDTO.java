package com.app.dto;

public class LoginAuthRequestDTO {
    private String email;
    private Long password;
    private Long phone;

    public String getEmail() {
        return email;
    }

    public Long getPassword() {
        return password;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
}
