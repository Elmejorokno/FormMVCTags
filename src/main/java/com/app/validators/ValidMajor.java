package com.app.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidMajorValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMajor {
    String message() default "Carrera inválida.";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
