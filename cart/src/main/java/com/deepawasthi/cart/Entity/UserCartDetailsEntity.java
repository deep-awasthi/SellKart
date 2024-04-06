package com.deepawasthi.cart.Entity;


import java.util.List;
import java.util.UUID;

public class UserCartDetailsEntity {

    private UUID userId;
    private List<ProductEntity> productList;

    public UserCartDetailsEntity() {
    }

    public UserCartDetailsEntity(UUID userId, List<ProductEntity> productList) {
        this.userId = userId;
        this.productList = productList;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public List<ProductEntity> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductEntity> productList) {
        this.productList = productList;
    }
}
