package com.app.dto;

import com.app.entity.Role;
import com.app.entity.UserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class UserRoleDTO {

    private Long userRoleId;
    private UserEntity user;
    private Role role;
    public boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
