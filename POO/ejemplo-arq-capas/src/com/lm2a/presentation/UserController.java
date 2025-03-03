package com.lm2a.presentation;

import com.lm2a.model.User;
import com.lm2a.services.IUserService;

import java.util.List;

public class UserController {

    //mostrar usuario x ID
    //mostrar el nombre + apellido (nombre completo) x ID
    //mostrar todos los usuarios

    private IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    public void showUser(int id){
        User userById = userService.getUserById(id);
        if(userById != null){
            System.out.println(userById);
        }else{
            System.out.println("El usuario "+id+" no existe");
        }
    }

    public void showCompleteName(int id){
        User userById = userService.getUserById(id);
        if(userById != null){
            System.out.println(userService.getCompleteName(userById));
        }else{
            System.out.println("El usuario "+id+" no existe");
        }
    }

    public void showAllUsers(){
        List<User> allUsers = userService.getAllUsers();
        for(User u: allUsers){
            System.out.println(u);
        }
    }

    public void saveUser(User user){
        userService.save(user);
        System.out.println("El usuario " + user.getId() + " Con nombre " + user.getName() +" ha sido guardado");
    }

    public void deleteUser(User user){
        if(userService.getUserById(user.getId()) != null){
            userService.delete(user);
            System.out.println("El usuario " + user.getId() + " Con nombre " + user.getName() + " ha sido eliminado");
        }
        else{
            System.out.println("El usuario " + user.getId() + " Con nombre " + user.getName() + " no existe");
        }
    }

    public void showAllUsersByLastName(){
        List<String> lastNames = userService.getAllLastNames();
        for(String lastName: lastNames){
            System.out.println(lastName);
        }
    }

    public void showAllUsersByEmail(){
        List<String> emails = userService.getAllEmails();
        for(String email: emails){
            System.out.println(email);
        }
    }
}
