package com.topera.zp.util;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * Created by topera on 18/06/17.
 */
public abstract class I18n {

    private static final String MESSAGES_FILE = "messages";

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle(MESSAGES_FILE);

    private I18n() {
    }

    public static String getMessage(String key, String... params) {
        return MessageFormat.format(resourceBundle.getString(key), (Object) params);
    }

}
