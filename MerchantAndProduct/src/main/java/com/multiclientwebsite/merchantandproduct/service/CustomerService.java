package com.multiclientwebsite.merchantandproduct.service;

import com.multiclientwebsite.merchantandproduct.entity.Customer;
import com.multiclientwebsite.merchantandproduct.entity.CustomerDTO;
import com.multiclientwebsite.merchantandproduct.exception.NoSuchCustomerExistsException;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerDTO customerDTO);

    Customer getCustomer(Long customerId) throws NoSuchCustomerExistsException;

    String updateCustomer(Long customerId, CustomerDTO customerDTO) throws NoSuchCustomerExistsException;

    String deleteCustomer(Long customerId) throws NoSuchCustomerExistsException;

    List<Customer> getAllCustomer();
}
