package com.app.service;

import com.app.dto.UserDTO;
import com.app.entity.UserEntity;
import com.app.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional
    @Override
    public UserDTO createUser(UserDTO userDTO) {
        UserEntity user = modelMapper.map(userDTO,UserEntity.class);
        System.out.println("Entity address after mapping: " + user.getAddress());
        UserEntity savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserDTO.class);
    }

    @Transactional(readOnly = true)
    @Override
    public UserDTO getUserById(Long userId) {
        UserEntity user = userRepository.findById(userId).orElseThrow(()->new RuntimeException("user not found"));
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream().map(user -> modelMapper.map(user,UserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public UserDTO updateUser(Long userId, UserDTO userDTO) {
        UserEntity existingUser = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("user not found"));
        modelMapper.map(userDTO,existingUser);
        UserEntity updatedUser = userRepository.save(existingUser);
        return modelMapper.map(updatedUser, UserDTO.class);
    }

    @Transactional
    @Override
    public void deleteUser(Long userId){
        UserEntity user = userRepository.findById(userId).orElseThrow(()-> new RuntimeException("user not found"));
        userRepository.delete(user);
    }

}
