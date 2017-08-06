package com.topera.zp.client;

import com.topera.zp.exceptions.ZPNotSupportedException;

import static com.topera.zp.client.MusicClientType.DEEZER;
import static com.topera.zp.client.MusicClientType.SPOTIFY;

/**
 * Created by topera on 18/06/17.
 */
public abstract class MusicClientFactory {

    private MusicClientFactory() {
    }

    public static MusicClient create(MusicClientType type){
        if (type == DEEZER) {
            return new DeezerClient();
        } else if (type == SPOTIFY) {
            return new SpotifyClient();
        }
        throw new ZPNotSupportedException();
    }

}
