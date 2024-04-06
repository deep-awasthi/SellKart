package com.deepawasthi.cart.Controller;

import com.deepawasthi.cart.Entity.CartEntity;
import com.deepawasthi.cart.Entity.UserCartDetailsEntity;
import com.deepawasthi.cart.Service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/cartService")
public class CartController {

    @Autowired
    CartServiceImpl cartService;

    @PostMapping("/addToCart")
    public void addToCart(@RequestBody CartEntity cart){
        cartService.addToCart(cart);
    }

    @DeleteMapping("/deleteFromCart")
    public void deleteFromCart(@RequestBody CartEntity cart){
        cartService.deleteFromCart(cart);
    }

    @GetMapping("/show/{userId}")
    public UserCartDetailsEntity showCartItems(@PathVariable("userId") UUID userId){
        return cartService.getCartDetails(userId);
    }
}
