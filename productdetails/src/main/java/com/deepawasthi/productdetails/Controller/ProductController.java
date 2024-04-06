package com.deepawasthi.productdetails.Controller;

import com.deepawasthi.productdetails.Entity.ProductEntity;
import com.deepawasthi.productdetails.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/productService")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @PostMapping("/saveProduct")
    public ProductEntity createProduct(@RequestBody ProductEntity product){
        return  productService.createProductDetails(product);
    }

    @GetMapping("/getAllProducts")
    public List<ProductEntity> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/getAllProducts/{productId}")
    public ProductEntity getProductById(@PathVariable("productId") UUID productId){
        return productService.getProductById(productId);
    }
}
