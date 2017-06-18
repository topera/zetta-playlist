package com.zp.client;

import com.zp.model.Playlist;
import com.zp.model.Playlists;
import com.zp.model.Track;

import java.util.List;

/**
 * Client to access Deezer API
 * Created by rafael on 18/06/17.
 */
public class DeezerClient extends MusicClient {

    private static final String BASE_URL = "http://api.deezer.com";
    private static final String URL_PLAYLISTS = "/chart/0/playlists";

    @Override
    public Playlists getPlaylists() {
        return (Playlists) sendRequest(BASE_URL + URL_PLAYLISTS, Playlists.class);
    }

    @Override
    public List<Track> getTracksFromPlaylist(Playlist playlist) {
        return null;
    }

}
