package com.lm2a.data;

import com.lm2a.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {

    ArrayList<User> users;

    public UserRepository() {
        users = new ArrayList<>();

        User u1 = new User(1, "Mario1", "La Menza1", "11111111X", "mario1@gmail.com");
        User u2 = new User(2, "Mario2", "La Menza2", "11111112X", "mario2@gmail.com");
        User u3 = new User(3, "Mario3", "La Menza3", "11111113X", "mario3@gmail.com");
        User u4 = new User(4, "Mario4", "La Menza4", "11111114X", "mario4@gmail.com");
        User u5 = new User(5, "Mario5", "La Menza5", "11111115X", "mario5@gmail.com");

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }

    @Override
    public User getUserById(int id) {
        User user = null;
        for(User u: users) {
            if(u.getId() == id) {
                user = u;
            }
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
