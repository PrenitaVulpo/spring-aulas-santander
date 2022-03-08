package com.aula04.banco.banco.utils;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CPFValidator.class)
public @interface Nome {
    String message() default "NOME INVÁLIDO";
    Class<?>[] groups() default {};
    Class <? extends Payload>[] payload() default {};
    String value() default "";
}
