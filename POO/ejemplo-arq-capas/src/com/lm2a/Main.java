package com.lm2a;

import com.lm2a.data.UserRepository;
import com.lm2a.model.User;
import com.lm2a.presentation.UserController;
import com.lm2a.services.UserService;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        UserController userController = new UserController(userService);

        userController.showUser(3);
        userController.showUser(5);
        userController.showCompleteName(2);
        userController.showAllUsers();

        User nuevo = new User(6,"Jacinto", "Piedra", "1234567Q", "jacinto@piedra.es");
        userController.saveUser(nuevo);

        User nuevo2 = new User(7,"Jacinto", "Piedra", "1234567Q", "jacinto@piedra.es");
        userController.saveUser(nuevo2);
        userController.showAllUsers();
        userController.deleteUser(nuevo2);

        userController.showAllUsers();

        userController.showAllUsersByLastName();

        userController.showAllUsersByEmail();
    }
}
