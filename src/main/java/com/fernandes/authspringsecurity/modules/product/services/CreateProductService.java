package com.fernandes.authspringsecurity.modules.product.services;

import com.fernandes.authspringsecurity.modules.product.entities.Product;
import com.fernandes.authspringsecurity.modules.product.model.request.ProductRequest;

public interface CreateProductService {
    Product execute(ProductRequest productRequest);
}
