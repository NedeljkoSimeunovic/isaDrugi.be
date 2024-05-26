package com.example.demo01.models;


import com.example.demo01.validators.ContactNumberConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class UserModel {
    private int id;
    @NotBlank
    private String firstName;
    private String lastName;
    @Email
    private String email;
    @ContactNumberConstraint
    private String contactNumber;
}
