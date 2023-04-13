package com.fernandes.authspringsecurity.modules.user.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_role")
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
