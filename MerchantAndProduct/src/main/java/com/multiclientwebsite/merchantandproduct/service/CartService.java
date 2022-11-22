package com.multiclientwebsite.merchantandproduct.service;

import com.multiclientwebsite.merchantandproduct.entity.Cart;
import com.multiclientwebsite.merchantandproduct.exception.NoSuchCartExistsException;
import com.multiclientwebsite.merchantandproduct.exception.NoSuchCustomerExistsException;
import com.multiclientwebsite.merchantandproduct.exception.NoSuchProductExistsException;

public interface CartService {

    public Cart addProductToCart(Long cartId, Long productId) throws NoSuchProductExistsException, NoSuchCustomerExistsException;

    public String removeProductFromCart(Long cartId, Long productId) throws NoSuchProductExistsException;

    public Cart showAllProductsInCart(Long cartId) throws NoSuchCartExistsException;

    public String clearCart(Long cartId);

    Cart getCart(Long customerId);
}

