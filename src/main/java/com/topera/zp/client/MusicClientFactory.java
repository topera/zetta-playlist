package com.topera.zp.client;

import com.topera.zp.exceptions.ZPNotSupportedException;

/**
 * Factory to create the correct music client
 * Created by topera on 18/06/17.
 */
public abstract class MusicClientFactory {

    public static MusicClient create(MusicClientType type){
        switch (type) {
            case DEEZER: return new DeezerClient();
            case SPOTIFY: return new SpotifyClient();
        }
        throw new ZPNotSupportedException();
    }

}
