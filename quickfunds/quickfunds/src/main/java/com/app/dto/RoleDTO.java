package com.app.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class RoleDTO {

    private String roleName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
