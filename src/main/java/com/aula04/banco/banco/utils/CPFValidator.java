package com.aula04.banco.banco.utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPFValidator implements ConstraintValidator<CPF, String> {

    @Override
    public void initialize(CPF constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String cpfSomenteDigitos = cpf
        return false;
    }
}
