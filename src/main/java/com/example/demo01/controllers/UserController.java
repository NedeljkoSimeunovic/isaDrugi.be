package com.example.demo01.controllers;

import com.example.demo01.models.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
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

    /*
    @PostMapping("create")
    public ResponseEntity<?> create(@RequestBody @Valid UserModel userModel, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Neuspesno registrovan!", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(userService.create(userModel), HttpStatus.CREATED);
    }
    */

    @PostMapping("create-user")
    public UserModel createUser(@RequestBody UserModel userModel){

        return userModel;
    }
}
