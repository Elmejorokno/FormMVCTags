package com.app.validators;

import com.app.utils.MajorsUtil;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidMajorValidator implements ConstraintValidator<ValidMajor, String> {
    @Override
    public boolean isValid(String major, ConstraintValidatorContext context) {
        return MajorsUtil.getMajors().contains(major);
    }
}
