package com.sola.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.sola.entity.User;

@Service
public interface UserService extends JpaRepository<User, Long>{
	User findByUsername(String username);
	
}
