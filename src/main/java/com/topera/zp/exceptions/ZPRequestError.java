package com.topera.zp.exceptions;

import com.topera.zp.util.I18n;

/**
 * Created by topera on 18/06/17.
 */
public class ZPRequestError extends ZPException {

    public ZPRequestError(Integer status) {
        super(I18n.getMessage("error.request.error", status.toString()));
    }
}
