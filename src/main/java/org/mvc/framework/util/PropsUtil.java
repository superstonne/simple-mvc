package org.mvc.framework.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Created by nick on 11/20/16.
 */
public class PropsUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * Load property file.
     * @param file
     * @return
     */
    public static Properties loadProps(String file) {
        Properties props = null;
        InputStream inputStream = null;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(file);
            if (inputStream == null) {
                throw new FileNotFoundException(file + " is not found");
            }
            props = new Properties();
            props.load(inputStream);
        } catch (IOException e) {
            LOGGER.error("Failed to load properties file", e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    LOGGER.error("Failed to close input stream", e);
                }
            }
        }
        return props;
    }

    public static String getString(Properties props, String key) {
        return getString(props, key, "");
    }

    public static String getString(Properties props, String key, String defaultValue) {
        String value = defaultValue;
        if (props.contains(key)) {
            value = props.getProperty(key);
        }
        return value;
    }

    public static int getInt(String props, String key, int defaultValue) {
        int value = defaultValue;
        if (props.contains(key)) {
//            value = props.getProperty(key);
        }
        return value;
    }
}
