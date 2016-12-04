package org.mvc.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by nick on 04/12/2016.
 */
@Target(ElementType.ANNOTATION_TYPE.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {
    String value();
}
