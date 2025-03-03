package com.lm2a.services;

import com.lm2a.model.User;

import java.util.List;

public interface IUserService {

    void save(User user);

    void delete(User user);

    User getUserById(int id);

    String getCompleteName(User user);

    List<User> getAllUsers();

    List<String> getAllLastNames();

    List<String> getAllEmails();

}
