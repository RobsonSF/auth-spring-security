package com.fernandes.authspringsecurity.modules.user.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "tb_user")
@Data
public class User {
    private UUID id;
    private String name;
    private String userName;
    private String password;
}
