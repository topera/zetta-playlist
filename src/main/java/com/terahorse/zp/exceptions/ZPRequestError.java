/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.exceptions;

import com.terahorse.zp.util.I18n;

public class ZPRequestError extends ZPException {

    public ZPRequestError(Integer status) {
        super(I18n.getMessage("error.request.error", status.toString()));
    }

}
