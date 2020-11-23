package com.av2.lojaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.av2.lojaapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
