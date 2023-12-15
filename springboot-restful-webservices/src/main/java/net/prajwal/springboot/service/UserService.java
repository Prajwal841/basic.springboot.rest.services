package net.prajwal.springboot.service;

import java.util.List;

import net.prajwal.springboot.dto.UserDto;
import net.prajwal.springboot.entity.User;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
