package com.deepawasthi.cart.Service;

import com.deepawasthi.cart.Entity.CartEntity;
import com.deepawasthi.cart.Entity.ProductEntity;
import com.deepawasthi.cart.Entity.UserCartDetailsEntity;
import com.deepawasthi.cart.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CartServiceImpl implements CartService{

    @Autowired
    CartRepository cartRepository;

    @Autowired
    ProductDetailsProxy productDetailsProxy;

    @Override
    public void addToCart(CartEntity cart) {
        cartRepository.save(cart);
    }

    @Override
    public void deleteFromCart(CartEntity cart) {
        cartRepository.delete(cart);
    }

    @Override
    public UserCartDetailsEntity getCartDetails(UUID userId) {
        UserCartDetailsEntity userCartDetailsEntity = new UserCartDetailsEntity();
        userCartDetailsEntity.setUserId(userId);

        List<CartEntity> user = cartRepository.findByuserId(userId);
        List<ProductEntity> products = new ArrayList<>();

        for(int i = 0; i<user.size(); i++){
            ProductEntity product = productDetailsProxy.getProductById(user.get(i).getProductId());
            products.add(product);
        }
        userCartDetailsEntity.setProductList(products);
        return userCartDetailsEntity;
    }
}
