package com.daily.expenses.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daily.expenses.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByUserSharesKey(String email);
}
