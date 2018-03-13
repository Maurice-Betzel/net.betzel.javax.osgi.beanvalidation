package net.betzel.javax.osgi.beanvalidation.service.impl;

import net.betzel.javax.osgi.beanvalidation.api.ValidationFactoryProvider;
import org.hibernate.validator.HibernateValidator;

import javax.validation.Validation;
import javax.validation.ValidationProviderResolver;
import javax.validation.ValidatorFactory;
import javax.validation.spi.ValidationProvider;
import java.util.Collections;
import java.util.List;

public class ValidationFactoryProviderImpl implements ValidationFactoryProvider {

    private final ValidatorFactory validatorFactory;

    public ValidationFactoryProviderImpl() {
        validatorFactory = Validation.byProvider(HibernateValidator.class)
                .providerResolver(new MyValidationProviderResolver())
                .configure()
                .externalClassLoader(getClass().getClassLoader())
                .buildValidatorFactory();
    }

    public ValidatorFactory getValidatorFactory() {
        return validatorFactory;
    }

    private static class MyValidationProviderResolver implements ValidationProviderResolver {

        public List<ValidationProvider<?>> getValidationProviders() {
            return Collections.<ValidationProvider<?>>singletonList(new HibernateValidator());
        }
    }

}