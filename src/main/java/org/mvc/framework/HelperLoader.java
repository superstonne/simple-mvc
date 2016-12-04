package org.mvc.framework;

import org.mvc.framework.helper.BeanHelper;
import org.mvc.framework.helper.ClassHelper;
import org.mvc.framework.helper.ControllerHelper;
import org.mvc.framework.helper.IocHelper;
import org.mvc.framework.util.ClassUtil;

/**
 * Created by nick on 04/12/2016.
 */
public final class HelperLoader {
    public static void init() {
        Class<?>[] classList = {ClassHelper.class, BeanHelper.class, IocHelper.class, ControllerHelper.class};
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
