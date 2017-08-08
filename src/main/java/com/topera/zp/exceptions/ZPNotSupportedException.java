package com.topera.zp.exceptions;

import com.topera.zp.util.I18n;

public class ZPNotSupportedException extends ZPException {

    public ZPNotSupportedException() {
        super(I18n.getMessage("error.not.implemented"));
    }
}
