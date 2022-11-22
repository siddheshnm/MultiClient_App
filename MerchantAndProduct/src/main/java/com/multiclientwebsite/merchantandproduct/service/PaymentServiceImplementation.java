package com.multiclientwebsite.merchantandproduct.service;

import com.multiclientwebsite.merchantandproduct.exception.NoSuchCustomerExistsException;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImplementation implements PaymentService {
    @Override
    public String orderProductsFromCart(Long customerId) throws NoSuchCustomerExistsException {
        
        return null;
    }
}
