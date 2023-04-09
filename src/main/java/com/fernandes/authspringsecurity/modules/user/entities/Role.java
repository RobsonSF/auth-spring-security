package com.fernandes.authspringsecurity.modules.user.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "tb_role")
@Data
public class Role {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;

    public Role(UUID id) {
        this.id = id;
    }
}
