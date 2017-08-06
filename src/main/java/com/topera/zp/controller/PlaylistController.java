package com.topera.zp.controller;

import com.topera.zp.client.MusicClient;
import com.topera.zp.client.MusicClientFactory;
import com.topera.zp.client.MusicClientType;
import com.topera.zp.model.zp.Playlist;
import com.topera.zp.model.zp.Playlists;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by topera on 18/06/17.
 */
@RestController
public class PlaylistController {

    /**
     * List all playlists
     * @return playlists
     */
    @RequestMapping("/api/playlist/{musicClientType}")
    public Playlists list(@PathVariable String musicClientType) {
        MusicClient musicClient = createMusicClient(musicClientType);
        return musicClient.getPlaylists();
    }

    /**
     * List details of a playlist
     * @return playlist
     */
    @RequestMapping("/api/playlist/{musicClientType}/{id}")
    public Playlist list(@PathVariable String musicClientType, @PathVariable String id) {
        MusicClient musicClient = createMusicClient(musicClientType);
        return musicClient.getPlaylist(Long.valueOf(id));
    }

    private static MusicClient createMusicClient(String musicClientTypeParam) {
        MusicClientType musicClientType = MusicClientType.convertString(musicClientTypeParam);
        return MusicClientFactory.create(musicClientType);
    }

}