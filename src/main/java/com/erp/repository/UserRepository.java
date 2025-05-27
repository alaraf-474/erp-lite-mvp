package com.erp.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
