package com.topera.zp.client;

import com.topera.zp.exceptions.ZPNotSupportedException;
import com.topera.zp.model.zp.Playlist;
import com.topera.zp.model.zp.Playlists;

/**
 * Client to access Spotify API (not implemented)
 */
public class SpotifyClient extends MusicClient {

    @Override
    public Playlists findPlaylists() {
        throw new ZPNotSupportedException();
    }

    @Override
    public Playlist findPlaylist(Long id) {
        throw new ZPNotSupportedException();
    }

}
