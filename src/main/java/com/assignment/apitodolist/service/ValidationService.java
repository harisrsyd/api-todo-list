package com.assignment.apitodolist.service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;

import java.util.Set;

public class ValidationService {
   
   private Validator validator;
   
   public ValidationService(Validator validator) {
      this.validator = validator;
   }
   
   public void validate(Object object) {
      Set<ConstraintViolation<Object>> violations = validator.validate(object);
      if (violations.size() != 0) {
         throw new ConstraintViolationException(violations);
      }
   }
}
