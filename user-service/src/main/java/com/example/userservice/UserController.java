package com.example.userservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    // if, user is already available, then find by id
    @GetMapping("/user")
    public UserResponse getUserByUserId(@RequestParam("userId") String userId) throws Exception {
        return userService.getUserByUserId(userId);
    }

    // if new user found, then create it
    @PostMapping("/user")
    public void createUser(@RequestBody UserRequest userRequest) throws JsonProcessingException {
        userService.createUser(userRequest);
    }

}
