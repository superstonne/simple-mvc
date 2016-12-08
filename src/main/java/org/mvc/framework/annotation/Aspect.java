package org.mvc.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by xiaobao on 2016/12/8.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    Class<? extends Annotation> value();
}
