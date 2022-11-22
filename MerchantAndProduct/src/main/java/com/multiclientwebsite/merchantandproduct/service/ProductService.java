package com.multiclientwebsite.merchantandproduct.service;

import com.multiclientwebsite.merchantandproduct.entity.Product;
import com.multiclientwebsite.merchantandproduct.entity.ProductDTO;
import com.multiclientwebsite.merchantandproduct.exception.NoSuchMerchantExistsException;
import com.multiclientwebsite.merchantandproduct.exception.NoSuchProductExistsException;

import java.util.List;

public interface ProductService {
    Product addProduct(ProductDTO productDTO) throws NoSuchMerchantExistsException;

    Product getProductWithMerchant(Long productId) throws NoSuchProductExistsException;

    String updateProduct(Long productId, ProductDTO productDTO) throws NoSuchProductExistsException;

    String deleteProduct(Long productId) throws NoSuchProductExistsException;

    List<Product> getAllProducts();
}
