package com.api.amason.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.api.amason.entities.ProductEntity;
import com.api.amason.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductController {
  @Autowired
  private ProductService productService;
  
  @GetMapping("/products")
  public List<ProductEntity> getProducts() {
    return productService.getAllProducts();
  }
  
}
