package com.fernandes.authspringsecurity.modules.product.services.impl;

import com.fernandes.authspringsecurity.modules.product.entities.Product;
import com.fernandes.authspringsecurity.modules.product.repositories.ProductRepository;
import com.fernandes.authspringsecurity.modules.product.services.FindAllProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FindAllProductServiceImpl implements FindAllProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Page<Product> execute(Pageable  pageable) {
        return repository.findAll(pageable);
    }
}
