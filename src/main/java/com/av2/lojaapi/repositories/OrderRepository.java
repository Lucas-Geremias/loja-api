package com.av2.lojaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.av2.lojaapi.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
