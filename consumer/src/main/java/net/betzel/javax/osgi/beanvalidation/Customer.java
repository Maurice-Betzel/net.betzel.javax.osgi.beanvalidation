package net.betzel.javax.osgi.beanvalidation;

import javax.validation.constraints.Min;

public class Customer {

    @Min(1)
    private final int status = 0;
}