package com.topera.zp.exceptions;

/**
 * All exceptions of ZP (ZettaPlaylist) will extend this base exception, to organize code
 * Created by topera on 18/06/17.
 */
class ZPException extends RuntimeException {

    ZPException(String message) {
        super(message);
    }

}
