package com.app.controller;


import com.app.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.app.service.UserServiceImplementation;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImplementation userServiceImplementation;

    @PostMapping("/create")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<UserDTO> createUser (@RequestBody UserDTO userDTO){
        System.out.println(">>>> Inside createUser API with: " + userDTO.getEmail());
        UserDTO createdUser = userServiceImplementation.createUser(userDTO);
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long userId){
        UserDTO getUser = userServiceImplementation.getUserById(userId);
        return ResponseEntity.ok(getUser);
    }
    @GetMapping()
    public ResponseEntity<List<UserDTO>> getAllUsers(){
        List <UserDTO> users  = userServiceImplementation.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long userId, @RequestBody UserDTO userDTO){
        UserDTO updatedUser = userServiceImplementation.updateUser(userId,userDTO);
        return ResponseEntity.ok(updatedUser);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity <UserDTO> updateUser(@PathVariable Long userId){
        userServiceImplementation.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }
}
