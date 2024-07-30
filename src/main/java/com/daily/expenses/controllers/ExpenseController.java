package com.daily.expenses.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daily.expenses.model.Expense;
import com.daily.expenses.service.ExpenseService;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;
    
    @PostMapping("/add")
    public ResponseEntity<String> addExpense(@RequestBody Expense expense) {
        expenseService.addExpense(expense);
        return ResponseEntity.ok("Expense added successfully");
    }
    
    @GetMapping("/user/{email}")
    public ResponseEntity<List<Expense>> getUserExpenses(@PathVariable String email) {
        return ResponseEntity.ok(expenseService.getUserExpenses(email));
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Expense>> getAllExpenses() {
        return ResponseEntity.ok(expenseService.getAllExpenses());
    }
    
    @GetMapping("/download")
    public ResponseEntity<String> downloadBalanceSheet() {
        expenseService.downloadBalanceSheet();
        return ResponseEntity.ok("Balance sheet downloaded successfully");
    }
}
