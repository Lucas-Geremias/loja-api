package com.av2.lojaapi.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.av2.lojaapi.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource{

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Lucas", "lucas@gmail.com", "999999999", "123qweasd");
		return ResponseEntity.ok().body(u);	
		}
}
