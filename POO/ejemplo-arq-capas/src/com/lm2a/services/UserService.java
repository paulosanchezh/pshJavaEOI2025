package com.lm2a.services;

import com.lm2a.data.IUserRepository;
import com.lm2a.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService{

    IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public String getCompleteName(User user) {
        return user.getName()+" "+user.getLastName();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public List<String> getAllLastNames() {
        List<String> lastNames = new ArrayList<>();
        for (User user : userRepository.getAllUsers()) {
            lastNames.add(user.getLastName());
        }
        return lastNames;
    }

    @Override
    public List<String> getAllEmails() {
        List<String> emails = new ArrayList<>();
        for (User user : userRepository.getAllUsers()) {
            emails.add(user.getEmail());
        }
        return emails;
    }
}
