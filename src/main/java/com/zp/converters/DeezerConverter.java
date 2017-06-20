package com.zp.converters;

import com.zp.model.deezer.PlaylistDeezer;
import com.zp.model.deezer.PlaylistsDeezer;
import com.zp.model.zp.Playlist;
import com.zp.model.zp.Playlists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 19/06/17.
 */
public abstract class DeezerConverter {

    /**
     * Converts Playlists from Deezer to our format
     * @param playlistsDeezer deezer format
     * @return zp format
     */
    public static Playlists convertPlaylists(PlaylistsDeezer playlistsDeezer){
        List<Playlist> data = new ArrayList<>();

        for (PlaylistDeezer playlistDeezer : playlistsDeezer.getData()) {
            data.add(convertPlaylist(playlistDeezer));
        }

        return new Playlists(data);
    }

    /**
     * Converts one Playlist from Deezer to our format
     * @param playlistDeezer deezer format
     * @return zp format
     */
    private static Playlist convertPlaylist(PlaylistDeezer playlistDeezer){
        Playlist playlist = new Playlist();
        playlist.setTitle(playlistDeezer.getTitle());
        playlist.setImage(playlistDeezer.getPicture());
        return playlist;
    }


}
