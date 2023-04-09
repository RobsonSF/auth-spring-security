package com.fernandes.authspringsecurity.modules.user.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_user")
@Data
public class User {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String userName;
    private String password;
    private Set<Role> roles;
}
