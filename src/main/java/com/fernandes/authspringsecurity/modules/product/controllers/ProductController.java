package com.fernandes.authspringsecurity.modules.product.controllers;

import com.fernandes.authspringsecurity.modules.product.entities.Product;
import com.fernandes.authspringsecurity.modules.product.model.request.ProductRequest;
import com.fernandes.authspringsecurity.modules.product.services.CreateProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private CreateProductService service;

    @PostMapping("/create")
    public ResponseEntity<Product> create(@RequestBody ProductRequest productRequest) {
        var product = service.execute(productRequest);
        return ResponseEntity.ok().body(product);
    }
}
