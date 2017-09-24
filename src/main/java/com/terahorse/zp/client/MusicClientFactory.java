/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.client;

import com.terahorse.zp.exception.ZPNotSupportedException;

import static com.terahorse.zp.client.MusicClientType.DEEZER;

public abstract class MusicClientFactory {

    public static MusicClient create(MusicClientType type){
        if (type == DEEZER) {
            return new DeezerClient();
        }
        throw new ZPNotSupportedException();
    }

}
