package com.fernandes.authspringsecurity.modules.product.services;

import com.fernandes.authspringsecurity.modules.product.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindAllProductService {
    Page<Product> execute(Pageable pageable);
}
