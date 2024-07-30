package com.daily.expenses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daily.expenses.model.Expense;
import com.daily.expenses.repository.ExpenseRepository;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;
    
    public void addExpense(Expense expense) {
      
        expenseRepository.save(expense);
    }
    
    public List<Expense> getUserExpenses(String email) {
        
        return expenseRepository.findByUserSharesKey(email);
    }
    
    public List<Expense> getAllExpenses() {
       
        return expenseRepository.findAll();
    }
    
    public void downloadBalanceSheet() {
        
    }
}
