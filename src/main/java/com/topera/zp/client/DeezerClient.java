package com.topera.zp.client;

import com.topera.zp.converters.DeezerConverter;
import com.topera.zp.model.deezer.PlaylistDeezer;
import com.topera.zp.model.deezer.PlaylistsDeezer;
import com.topera.zp.model.zp.Playlist;
import com.topera.zp.model.zp.Playlists;

/**
 * Created by topera on 18/06/17.
 */
public class DeezerClient implements MusicClient {

    private static final String BASE_URL = "http://api.deezer.com";
    private static final String URL_PLAYLISTS = "/chart/0/playlists";
    private static final String URL_PLAYLIST = "/playlist";

    @Override
    public Playlists getPlaylists() {
        String url = BASE_URL + URL_PLAYLISTS;
        PlaylistsDeezer playlistsDeezer = sendRequest(url, PlaylistsDeezer.class);
        return DeezerConverter.convertPlaylists(playlistsDeezer);
    }

    @Override
    public Playlist getPlaylist(Long id) {
        String url = BASE_URL + URL_PLAYLIST + "/" + id;
        PlaylistDeezer playlistDeezer = sendRequest(url, PlaylistDeezer.class);
        return DeezerConverter.convertPlaylist(playlistDeezer);
    }

}
