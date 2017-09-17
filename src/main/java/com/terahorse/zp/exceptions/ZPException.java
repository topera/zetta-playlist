/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.exceptions;

/**
 * All exceptions of ZP (ZettaPlaylist) will extend this base exception, to organize code
 */
class ZPException extends RuntimeException {

    ZPException(String message) {
        super(message);
    }

}
