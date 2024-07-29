package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.dto.UserRequest;
import com.example.api.entity.User;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);

	User save(UserRequest userRequest);
}
