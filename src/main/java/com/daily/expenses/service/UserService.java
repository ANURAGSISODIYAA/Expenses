package com.daily.expenses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daily.expenses.model.User;
import com.daily.expenses.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public void createUser(User user) {
       
        userRepository.save(user);
    }
    
    public User getUserDetails(String email) {
        
        return userRepository.findByEmail(email);
    }
}
