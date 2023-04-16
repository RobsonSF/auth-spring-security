package com.fernandes.authspringsecurity.modules.product.controllers;

import com.fernandes.authspringsecurity.modules.product.controllers.mapper.ProductResponseMapper;
import com.fernandes.authspringsecurity.modules.product.entities.Product;
import com.fernandes.authspringsecurity.modules.product.model.request.ProductRequest;
import com.fernandes.authspringsecurity.modules.product.model.response.ProductResponse;
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

    @Autowired
    private ProductResponseMapper mapper;

//    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest) {
        var product = createProductService.execute(productRequest);
        var productResponse = mapper.toProductResponse(product);
        return ResponseEntity.ok().body(productResponse);
    }

//    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public ResponseEntity<Page<ProductResponse>> findAll(Pageable pageable) {
        var products = findAllProductService.execute(pageable);
        var productsResponse  = products.map(mapper::toProductResponse);
        return ResponseEntity.ok().body(productsResponse);
    }
}
