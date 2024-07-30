package com.daily.expenses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daily.expenses.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
