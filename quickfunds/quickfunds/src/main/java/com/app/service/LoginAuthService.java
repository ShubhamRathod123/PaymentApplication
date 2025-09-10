package com.app.service;

import com.app.dto.UserDTO;
import com.app.entity.UserEntity;
import com.app.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginAuthService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public LoginAuthService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }
    public UserDTO userLoginByEmail(String email,Long password){
        UserEntity user = userRepository.findByEmailAndPassword(email, password).orElseThrow(()-> new RuntimeException("wrong email or password"));
        return modelMapper.map(user,UserDTO.class);
    }
    public UserDTO userLoginByPhone(Long phone, Long password){
        UserEntity user = userRepository.findByPhoneAndPassword(phone, password).orElseThrow(()-> new RuntimeException("wrong email or password"));
        return modelMapper.map(user,UserDTO.class);
    }
}
