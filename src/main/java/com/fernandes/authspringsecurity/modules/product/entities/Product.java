package com.fernandes.authspringsecurity.modules.product.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "tb_product")
@Data
public class Product {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String description;
}
