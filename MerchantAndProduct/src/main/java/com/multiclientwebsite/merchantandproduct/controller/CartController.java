package com.multiclientwebsite.merchantandproduct.controller;

import com.multiclientwebsite.merchantandproduct.entity.Cart;
import com.multiclientwebsite.merchantandproduct.exception.NoSuchCartExistsException;
import com.multiclientwebsite.merchantandproduct.exception.NoSuchCustomerExistsException;
import com.multiclientwebsite.merchantandproduct.exception.NoSuchProductExistsException;
import com.multiclientwebsite.merchantandproduct.service.CartService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
@Slf4j
public class CartController {
    @Autowired
    CartService cartService;

    @PutMapping("/{customerId}/{productId}")
    public Cart addProductToCart(@PathVariable("customerId") Long customerId, @PathVariable Long productId) throws NoSuchProductExistsException, NoSuchCustomerExistsException {
        log.info("Inside saveCart method of CartController");
        return cartService.addProductToCart(customerId, productId);
    }

//    @GetMapping("/cart/{customerId}")
//    public Cart getCart(@PathVariable ("customerId") Long customerId){
//        return cartService.getCart(customerId);
//    }

    @PutMapping("/remove/{cartId}{productId}")
    public String removeProductFromCart(@PathVariable("cartId") Long cartId, @RequestBody Long productId) throws NoSuchProductExistsException {
        log.info(("Inside findCartById method of CartController"));
        return cartService.removeProductFromCart(cartId, productId);
    }

    @GetMapping("/{cartId}")
    public Cart showAllProductsInCart(@PathVariable("cartId") Long cartId) throws NoSuchCartExistsException {
        return cartService.showAllProductsInCart(cartId);
    }

    @PutMapping("/{cartId}")
    public String clearCart(@PathVariable("cartId") Long cartId) {
        return cartService.clearCart(cartId);
    }
}


