/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.util;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public interface I18n {

    static String getMessage(String key, String... params) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");
        return MessageFormat.format(resourceBundle.getString(key), (Object) params);
    }

}
