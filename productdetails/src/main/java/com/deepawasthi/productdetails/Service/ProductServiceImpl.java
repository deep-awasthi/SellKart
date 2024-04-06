package com.deepawasthi.productdetails.Service;

import com.deepawasthi.productdetails.Entity.ProductEntity;
import com.deepawasthi.productdetails.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductEntity createProductDetails(ProductEntity product) {
        return productRepository.save(product);
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity getProductById(UUID productId) {
        return productRepository.findById(productId).orElseThrow(()->new RuntimeException("No Product Found"));
    }
}
