package net.prajwal.springboot.rest.services.service;

import java.util.List;

import net.prajwal.springboot.rest.services.entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
