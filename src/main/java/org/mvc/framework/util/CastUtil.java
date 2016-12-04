package org.mvc.framework.util;

/**
 * Created by nick on 04/12/2016.
 */
public class CastUtil {

    public static long castLong(Object o) {
        return CastUtil.castLong(o, 0);
    }

    public static long castLong(Object o, long defalut) {
        long value = defalut;
        if (o != null) {
            String strValue = castString(o);
            if (StringUtil.isNotEmpty(strValue)) {
                try {
                    value = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    value = defalut;
                }
            }
        }
        return value;
    }

    public static String castString(Object o) {
        return null;
    }
}
