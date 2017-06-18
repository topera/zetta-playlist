package com.zp.client;

import com.zp.exceptions.ZPNotSupportedException;
import com.zp.model.Playlist;
import com.zp.model.Track;

import java.util.List;

/**
 * Client to access Spotify API (not implemented)
 * Created by rafael on 18/06/17.
 */
class SpotifyClient implements MusicClient {

    @Override
    public List<Playlist> getPlaylists() {
        throw new ZPNotSupportedException();
    }

    @Override
    public List<Track> getTracksFromPlaylist(Playlist playlist) {
        throw new ZPNotSupportedException();
    }

}
