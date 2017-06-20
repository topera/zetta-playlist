package com.zp.client;

import com.zp.converters.DeezerConverter;
import com.zp.model.deezer.PlaylistDeezer;
import com.zp.model.deezer.PlaylistsDeezer;
import com.zp.model.zp.Playlists;
import com.zp.model.zp.Track;

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
        PlaylistsDeezer playlistsDeezer = (PlaylistsDeezer) sendRequest(BASE_URL + URL_PLAYLISTS, PlaylistsDeezer.class);
        return DeezerConverter.convertPlaylists(playlistsDeezer);
    }

    @Override
    public List<Track> getTracksFromPlaylist(PlaylistDeezer playlist) {
        return null;
    }

}
