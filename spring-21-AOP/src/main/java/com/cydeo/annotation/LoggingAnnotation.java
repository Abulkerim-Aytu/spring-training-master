package com.cydeo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // In here we define, where we can use this annotation.
@Retention(RetentionPolicy.RUNTIME)
public @interface LoggingAnnotation {
}
