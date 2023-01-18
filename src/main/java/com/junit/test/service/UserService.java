package com.junit.test.service;

import com.junit.test.model.User;
import com.junit.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user)
    {
        return repository.save(user);
    }

    public List<User> getAllUsers()
    {
        System.out.println("data from DataBase:- " +repository.findAll());
        return repository.findAll();
    }


    public void deleteUSerById(int id)
    {
        repository.deleteById(id);
    }
}
