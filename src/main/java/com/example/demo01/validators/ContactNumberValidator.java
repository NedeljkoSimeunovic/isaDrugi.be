package com.example.demo01.validators;



import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;

public class ContactNumberValidator implements ConstraintValidator<ContactNumberConstraint, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.matches("[0-9]+") && (s.length()> 8) && (s.length()< 14);
    }
}
