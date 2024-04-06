package com.deepawasthi.UserMetaData.Controller;

import com.deepawasthi.UserMetaData.Entity.UserEntity;
import com.deepawasthi.UserMetaData.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/userService")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping("/saveUserDetails")
    public UserEntity saveUserDetails(@RequestBody UserEntity user){
        return userService.createUser(user);
    }

    @GetMapping("/getUserDetails/{userId}")
    public UserEntity getUserDetails(@PathVariable("userId") Long userId){
        return userService.getUserDetails(userId);
    }
}
