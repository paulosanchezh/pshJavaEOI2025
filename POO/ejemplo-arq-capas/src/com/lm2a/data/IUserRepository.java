package com.lm2a.data;

import com.lm2a.model.User;

import java.util.List;

public interface IUserRepository {

    void save(User user);

    void delete(User user);

    User getUserById(int id);

    List<User> getAllUsers();
}
