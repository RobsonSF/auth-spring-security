package com.fernandes.authspringsecurity.modules.product.services.impl;

import com.fernandes.authspringsecurity.modules.product.entities.Product;
import com.fernandes.authspringsecurity.modules.product.model.request.ProductRequest;
import com.fernandes.authspringsecurity.modules.product.repositories.ProductRepository;
import com.fernandes.authspringsecurity.modules.product.services.CreateProductService;
import com.fernandes.authspringsecurity.modules.product.services.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateProductServiceImpl implements CreateProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public Product execute(ProductRequest productRequest) {
        var product = mapper.toProductEntity(productRequest);
        return repository.save(product);
    }
}
