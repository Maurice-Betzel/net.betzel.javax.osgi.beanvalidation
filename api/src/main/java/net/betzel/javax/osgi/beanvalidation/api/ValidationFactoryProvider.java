package net.betzel.javax.osgi.beanvalidation.api;

import javax.validation.ValidatorFactory;

public interface ValidationFactoryProvider {

    ValidatorFactory getValidatorFactory();

}