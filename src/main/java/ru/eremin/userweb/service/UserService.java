package ru.eremin.userweb.service;

import ru.eremin.userweb.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUser(Long id);

    void deleteUser(Long id);

    void editUser(User user);
}
