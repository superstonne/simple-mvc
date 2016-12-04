package org.mvc.framework.util;

import org.apache.commons.lang3.ArrayUtils;
import org.omg.CORBA.ObjectHelper;

/**
 * Created by nick on 04/12/2016.
 */
public class ArrayUtil {
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }

    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
