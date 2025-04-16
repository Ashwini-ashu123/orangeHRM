package HRM.Utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class locatorProp {

    private static Properties prop = new Properties();

    static {
        try {
            InputStream inputStream = locatorProp.class.getClassLoader().getResourceAsStream("locator.properties");
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new RuntimeException("locator.properties file not found in classpath");
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load locator.properties file", e);
        }
    }

    public static String getObjectID(String key) {
        String value = prop.getProperty(key);
        if (value == null) {
            throw new IllegalArgumentException("Key '" + key + "' not found in locator.properties");
        }
        return value;
    }
}
