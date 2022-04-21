package ru.eremin.userweb.dao;

import ru.eremin.userweb.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUser(Long id);

    void deleteUser(Long id);

    void editUser(User user);
}
