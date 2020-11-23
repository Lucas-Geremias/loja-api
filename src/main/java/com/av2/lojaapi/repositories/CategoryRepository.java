package com.av2.lojaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.av2.lojaapi.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
