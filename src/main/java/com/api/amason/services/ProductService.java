package com.api.amason.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.amason.entities.ProductEntity;
import com.api.amason.repositories.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public List<ProductEntity> getAllProducts() {
    log.info("Fetching all products");
    List<ProductEntity> products = productRepository.findAll();
    log.info("Ending fetching of all products");
    return products;
  }
}
