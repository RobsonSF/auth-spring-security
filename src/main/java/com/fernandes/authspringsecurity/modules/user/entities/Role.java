package com.fernandes.authspringsecurity.modules.user.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "tb_role")
@Data
public class Role {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique = true)
    private String name;

    public Role(UUID id) {
        this.id = id;
    }
}
