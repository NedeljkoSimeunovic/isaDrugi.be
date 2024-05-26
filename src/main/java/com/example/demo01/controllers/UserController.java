package com.example.demo01.controllers;

import com.example.demo01.models.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    private boolean userModel1;

    @GetMapping("get-first-name")
    public String getFirstName(){
        return "nedeljko";
    }

    @GetMapping("get-first-name-list")
    public List<String> getFirstNameList(){
        return List.of("Nedeljko","Petar");
    }

    @PostMapping("create-user")
    public UserModel createUser(@RequestBody UserModel userModel){
        
        return userModel;
    }
}
