package net.betzel.javax.osgi.beanvalidation;

import net.betzel.javax.osgi.beanvalidation.api.ValidationFactoryProvider;

import javax.validation.ConstraintViolation;
import javax.validation.Path;
import javax.validation.Validator;
import java.util.Set;

public class Consumer {

    ValidationFactoryProvider validationFactoryProvider;

    public Consumer() {
    }

    public void init() {
        Validator validator = validationFactoryProvider.getValidatorFactory().getValidator();
        Set<ConstraintViolation<Customer>> constraintViolations = validator.validate(new Customer());
        for(ConstraintViolation<Customer> constraintViolation : constraintViolations) {
            for(Path.Node node : constraintViolation.getPropertyPath()) {
                System.out.println("Field name: " + node.getName());
            }
            System.out.println("Violation: " + constraintViolation.getPropertyPath().toString() + " " + constraintViolation.getMessage());
        }
    }

    public void setValidationFactoryProvider(ValidationFactoryProvider validationFactoryProvider) {
        this.validationFactoryProvider = validationFactoryProvider;
    }
}
