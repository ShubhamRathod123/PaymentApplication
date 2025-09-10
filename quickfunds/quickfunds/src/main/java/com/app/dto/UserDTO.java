package com.app.dto;

import com.app.entity.UserVerificationStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;
import java.time.LocalDateTime;


public class UserDTO {

    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;
    private Long phone;
    private UserVerificationStatus statusType;
    private String address;
    private Long password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Long getPhone() {
        return phone;
    }

    public UserVerificationStatus getStatusType() {
        return statusType;
    }

    public String getAddress() {
        return address;
    }

    public Long getPassword() {
        return password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public void setStatusType(UserVerificationStatus statusType) {
        this.statusType = statusType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
