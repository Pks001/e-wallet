package com.example.userservice;

import org.springframework.data.jpa.repository.JpaRepository;

// create a jpa repository for users
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserId(String userId);
}
