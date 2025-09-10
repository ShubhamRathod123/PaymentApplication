package com.app.service;

import com.app.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);

    UserDTO getUserById(Long userId);

   List<UserDTO> getAllUsers();

    UserDTO updateUser (Long userId, UserDTO userDTO);

    void deleteUser(Long userId);
}
