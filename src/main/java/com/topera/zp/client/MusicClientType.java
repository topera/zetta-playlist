package com.topera.zp.client;

public enum MusicClientType {

    DEEZER;

    public static MusicClientType convertString(String musicClientType) {
        return MusicClientType.valueOf(musicClientType.toUpperCase());
    }

}
