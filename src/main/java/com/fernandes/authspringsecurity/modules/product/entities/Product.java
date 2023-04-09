package com.fernandes.authspringsecurity.modules.product.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "tb_product")
@Data
public class Product {
    private UUID id;
    private String name;
    private String description;
}
