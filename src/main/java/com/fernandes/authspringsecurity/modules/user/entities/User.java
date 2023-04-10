package com.fernandes.authspringsecurity.modules.user.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_user")
@Data
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @Column(unique = true)
    private String username;

    private String password;

    @ManyToMany
    private List<Role> roles;
}
