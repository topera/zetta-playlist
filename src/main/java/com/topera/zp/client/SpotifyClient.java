package com.topera.zp.client;

import com.topera.zp.exceptions.ZPNotSupportedException;
import com.topera.zp.model.zp.Playlist;
import com.topera.zp.model.zp.Playlists;

/**
 * Client to access Spotify API (not implemented)
 */
public class SpotifyClient implements MusicClient {

    @Override
    public Playlists getPlaylists() {
        throw new ZPNotSupportedException();
    }

    @Override
    public Playlist getPlaylist(Long id) {
        throw new ZPNotSupportedException();
    }

}
