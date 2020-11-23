package com.av2.lojaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.av2.lojaapi.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
