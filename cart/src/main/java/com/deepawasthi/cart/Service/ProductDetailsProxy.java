package com.deepawasthi.cart.Service;

import com.deepawasthi.cart.Entity.ProductEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@Component
@FeignClient(value = "productdetails", url = "localhost:8082")
public interface ProductDetailsProxy {

    @GetMapping("/productService/products/search/{productId}")
    public ProductEntity getProductById(@PathVariable UUID productId);
}
