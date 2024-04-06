package com.deepawasthi.productdetails.Service;

import com.deepawasthi.productdetails.Entity.ProductEntity;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    public ProductEntity createProductDetails(ProductEntity product);

    public List<ProductEntity> getAllProducts();

    public ProductEntity getProductById(UUID productId);
}
