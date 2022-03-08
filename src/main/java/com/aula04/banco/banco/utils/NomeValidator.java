package com.aula04.banco.banco.utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NomeValidator implements ConstraintValidator<Nome, String> {
    @Override
    public void initialize(Nome constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String nome, ConstraintValidatorContext context) {

        return nome.length() > 3;
    }
}
