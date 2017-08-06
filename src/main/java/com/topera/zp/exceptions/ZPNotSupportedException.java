package com.topera.zp.exceptions;

import com.topera.zp.util.I18n;

/**
 * Created by topera on 18/06/17.
 */
public class ZPNotSupportedException extends ZPException {

    public ZPNotSupportedException() {
        super(I18n.getMessage("error.not.implemented"));
    }
}
