package org.mvc.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by nick on 04/12/2016.
 */
public final class StringUtil {
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static String[] splitString(String body, String s) {
        String[] array;
        array = body.split(s);
        return array;
    }
}
