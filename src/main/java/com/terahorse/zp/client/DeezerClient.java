/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.client;

import com.terahorse.zp.converter.DeezerConverter;
import com.terahorse.zp.model.deezer.PlaylistDeezer;
import com.terahorse.zp.model.deezer.PlaylistsDeezer;
import com.terahorse.zp.model.zp.Playlist;
import com.terahorse.zp.model.zp.Playlists;

public class DeezerClient extends MusicClient {

    private static final String BASE_URL = "http://api.deezer.com";
    private static final String URL_PLAYLISTS = "/chart/0/playlists";
    private static final String URL_PLAYLIST = "/playlist";

    private DeezerConverter deezerConverter = new DeezerConverter();

    @Override
    public Playlists findPlaylists() {
        String url = BASE_URL + URL_PLAYLISTS;
        PlaylistsDeezer playlistsDeezer = sendRequest(url, PlaylistsDeezer.class);
        return deezerConverter.convertPlaylists(playlistsDeezer);
    }

    @Override
    public Playlist findPlaylist(Long id) {
        String url = BASE_URL + URL_PLAYLIST + "/" + id;
        PlaylistDeezer playlistDeezer = sendRequest(url, PlaylistDeezer.class);
        return deezerConverter.convertPlaylist(playlistDeezer);
    }

}
