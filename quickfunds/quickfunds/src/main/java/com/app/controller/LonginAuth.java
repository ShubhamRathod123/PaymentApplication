package com.app.controller;

import com.app.dto.LoginAuthRequestDTO;
import com.app.dto.UserDTO;
import com.app.service.LoginAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LonginAuth {
    @Autowired
    public LoginAuthService loginAuthService;
    @PostMapping("/emailLogin")
    @CrossOrigin(origins = "http://localhost:3000")
    public UserDTO loginUserByEmail(@RequestBody LoginAuthRequestDTO userLoginRequestDTO){
        return loginAuthService.userLoginByEmail(userLoginRequestDTO.getEmail(), userLoginRequestDTO.getPassword());
    }
    @PostMapping("/phoneLogin")
    @CrossOrigin(origins = "http://localhost:3000")
    public UserDTO loginUserByPhone(@RequestBody LoginAuthRequestDTO userLoginRequest){
        return loginAuthService.userLoginByPhone(userLoginRequest.getPhone(),userLoginRequest.getPassword());
    }
}
