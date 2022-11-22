package com.multiclientwebsite.merchantandproduct.controller;

import com.multiclientwebsite.merchantandproduct.entity.Product;
import com.multiclientwebsite.merchantandproduct.entity.ProductDTO;
import com.multiclientwebsite.merchantandproduct.exception.NoSuchMerchantExistsException;
import com.multiclientwebsite.merchantandproduct.exception.NoSuchProductExistsException;
import com.multiclientwebsite.merchantandproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/")
    public Product addProductToMerchant(@RequestBody ProductDTO productDTO) throws NoSuchMerchantExistsException {
        return productService.addProduct(productDTO);
    }

    @GetMapping("/{productId}")
    public Product getProductWithMerchant(@PathVariable("productId") Long productId) throws NoSuchProductExistsException {
        return productService.getProductWithMerchant(productId);
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId, @RequestBody ProductDTO productDTO) throws NoSuchProductExistsException {
        return productService.updateProduct(productId, productDTO);
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) throws NoSuchProductExistsException {
        return productService.deleteProduct(productId);
    }

    @GetMapping("/")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }


}
