package org.mvc.framework.helper;

import org.mvc.framework.annotation.Inject;
import org.mvc.framework.util.ArrayUtil;
import org.mvc.framework.util.CollectionUtil;
import org.mvc.framework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Created by nick on 04/12/2016.
 */
public final class IocHelper {

    static {
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            for (Map.Entry<Class<?>, Object> beanEntry: beanMap.entrySet()) {
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                Field[] fields = beanClass.getFields();
                if (ArrayUtil.isNotEmpty(fields)) {
                    for (Field field : fields) {
                        if (field.isAnnotationPresent(Inject.class)) {
                            Class<?> beanFileClass = field.getType();
                            Object beanFieldInstance = beanMap.get(beanFileClass);
                            if (beanFieldInstance != null) {
                                ReflectionUtil.setField(beanInstance, field, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
