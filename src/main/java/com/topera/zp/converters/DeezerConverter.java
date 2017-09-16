package com.topera.zp.converters;

import com.topera.zp.client.MusicClientType;
import com.topera.zp.model.deezer.PlaylistDeezer;
import com.topera.zp.model.deezer.PlaylistsDeezer;
import com.topera.zp.model.zp.Playlist;
import com.topera.zp.model.zp.Playlists;

import java.util.ArrayList;
import java.util.List;

public class DeezerConverter {

    private static final int MAX_PLAYLISTS = 7;

    public Playlists convertPlaylists(PlaylistsDeezer playlistsDeezer){
        List<Playlist> data = new ArrayList<>();

        for (PlaylistDeezer playlistDeezer : playlistsDeezer.getData()) {
            if (data.size() < MAX_PLAYLISTS) {
                data.add(convertPlaylist(playlistDeezer));
            }
        }

        return new Playlists(data);
    }

    public Playlist convertPlaylist(PlaylistDeezer playlistDeezer){
        Playlist playlist = new Playlist();

        playlist.setId(playlistDeezer.getId());
        playlist.setMusicClientType(MusicClientType.DEEZER.toString().toLowerCase());
        playlist.setTitle(playlistDeezer.getTitle());
        playlist.setImage(playlistDeezer.getPicture());
        playlist.setDescription(playlistDeezer.getDescription());
        playlist.setImageBig(playlistDeezer.getPicture_medium());

        return playlist;
    }


}
