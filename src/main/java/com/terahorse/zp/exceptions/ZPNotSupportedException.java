/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.exceptions;

import com.terahorse.zp.util.I18n;

public class ZPNotSupportedException extends ZPException {

    public ZPNotSupportedException() {
        super(I18n.getMessage("error.not.implemented"));
    }
}
