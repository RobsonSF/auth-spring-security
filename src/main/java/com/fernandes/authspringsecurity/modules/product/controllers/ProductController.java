package com.fernandes.authspringsecurity.modules.product.controllers;

import com.fernandes.authspringsecurity.modules.product.entities.Product;
import com.fernandes.authspringsecurity.modules.product.model.request.ProductRequest;
import com.fernandes.authspringsecurity.modules.product.services.CreateProductService;
import com.fernandes.authspringsecurity.modules.product.services.FindAllProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private CreateProductService createProductService;

    @Autowired
    private FindAllProductService findAllProductService;

    @PostMapping("/create")
    public ResponseEntity<Product> create(@RequestBody ProductRequest productRequest) {
        var product = createProductService.execute(productRequest);
        return ResponseEntity.ok().body(product);
    }

    @GetMapping
    public ResponseEntity<Page<Product>> findAll(Pageable pageable) {
        var products = findAllProductService.execute(pageable);
        return ResponseEntity.ok().body(products);
    }
}
