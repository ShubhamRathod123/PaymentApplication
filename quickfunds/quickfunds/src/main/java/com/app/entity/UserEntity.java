package com.app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "email",nullable = false,unique = true)
    @Pattern(regexp = "^[A-Za-z0-9_.-]+@[A-Za-z0-9.-]+$",message = "Email must be Valid")
    private String email;

    @Column(name = "date_of_birth",nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false,unique = true,length = 10)
    @Digits(integer = 10, fraction = 0, message = "Phone number must be exactly 10 digits")
    private Long phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "status",nullable = false)
    private UserVerificationStatus statusType;

    @Column(nullable = false,name = "address")
    private String address;

    @Column(nullable = false)
    @Digits(integer = 6,fraction = 0,message = "Password must be 6 digit long")
    private Long password;

    @Column(name = "created_at",nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at",nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public UserEntity(String firstName, String lastName, String email, LocalDate dateOfBirth, @Digits(integer = 10, fraction = 0) Long phone, UserVerificationStatus statusType, String address, Long password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.statusType = statusType;
        this.address = address;
        this.password = password;
    }
    public UserEntity(){

    }

    public Long getUserId() {
        return userId;
    }

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

    public void setUserId(Long userId) {
        this.userId = userId;
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
