package com.av2.lojaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.av2.lojaapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
