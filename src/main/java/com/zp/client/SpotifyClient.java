package com.zp.client;

import com.zp.exceptions.ZPNotSupportedException;
import com.zp.model.deezer.PlaylistDeezer;
import com.zp.model.zp.Playlists;
import com.zp.model.zp.Track;

import java.util.List;

/**
 * Client to access Spotify API (not implemented)
 * Created by rafael on 18/06/17.
 */
public class SpotifyClient extends MusicClient {

    @Override
    public Playlists getPlaylists() {
        throw new ZPNotSupportedException();
    }

    @Override
    public List<Track> getTracksFromPlaylist(PlaylistDeezer playlist) {
        throw new ZPNotSupportedException();
    }

}
