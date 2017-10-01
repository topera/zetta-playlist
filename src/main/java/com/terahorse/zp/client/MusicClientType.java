/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.client;

import java.util.Locale;

public enum MusicClientType {

    DEEZER,
    SPOTIFY;

    public static MusicClientType convertString(String musicClientType) {
        return MusicClientType.valueOf(musicClientType.toUpperCase(Locale.ENGLISH));
    }

}
