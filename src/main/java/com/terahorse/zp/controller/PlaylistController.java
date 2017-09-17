/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.controller;

import com.terahorse.zp.client.MusicClient;
import com.terahorse.zp.client.MusicClientFactory;
import com.terahorse.zp.client.MusicClientType;
import com.terahorse.zp.model.zp.Playlist;
import com.terahorse.zp.model.zp.Playlists;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistController {

    /**
     * List all playlists
     * @return playlists
     */
    @RequestMapping("/api/playlist/{musicClientType}")
    public Playlists list(@PathVariable String musicClientType) {
        MusicClient musicClient = createMusicClient(musicClientType);
        return musicClient.findPlaylists();
    }

    /**
     * List details of a playlist
     * @return playlist
     */
    @RequestMapping("/api/playlist/{musicClientType}/{id}")
    public Playlist list(@PathVariable String musicClientType, @PathVariable String id) {
        MusicClient musicClient = createMusicClient(musicClientType);
        return musicClient.findPlaylist(Long.valueOf(id));
    }

    private static MusicClient createMusicClient(String musicClientTypeParam) {
        MusicClientType musicClientType = MusicClientType.convertString(musicClientTypeParam);
        return MusicClientFactory.create(musicClientType);
    }

}