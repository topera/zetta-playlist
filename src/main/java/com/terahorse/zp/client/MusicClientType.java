/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.client;

public enum MusicClientType {

    DEEZER;

    public static MusicClientType convertString(String musicClientType) {
        return MusicClientType.valueOf(musicClientType.toUpperCase());
    }

}
