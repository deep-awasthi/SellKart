package com.deepawasthi.cart.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity(name = "carts")
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public long cartId;

    public UUID userId;
    public UUID productId;

    public CartEntity() {
    }

    public CartEntity(long cartId, UUID userId, UUID productId) {
        this.cartId = cartId;
        this.userId = userId;
        this.productId = productId;
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }
}
