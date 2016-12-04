package org.mvc.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by nick on 04/12/2016.
 */
public final class StreamUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringUtil.class);

    public static String getString(InputStream is) {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (Exception e) {
            LOGGER.error("Failed to get string.", e);
            throw new RuntimeException(e);
        }
        return builder.toString();
    }
}
