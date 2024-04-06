package com.deepawasthi.cart.Service;

import com.deepawasthi.cart.Entity.CartEntity;
import com.deepawasthi.cart.Entity.UserCartDetailsEntity;

import java.util.UUID;

public interface CartService {
    public void addToCart(CartEntity cart);

    public void deleteFromCart(CartEntity cart);

    public UserCartDetailsEntity getCartDetails(UUID userId);
}
