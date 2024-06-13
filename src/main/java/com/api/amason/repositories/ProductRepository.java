package com.api.amason.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.amason.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{ }
