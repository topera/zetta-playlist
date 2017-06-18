package com.zp.client;

import com.zp.model.Playlist;
import com.zp.model.Track;

import java.util.List;

/**
 * Client to access Deezer API
 * Created by rafael on 18/06/17.
 */
public class DeezerClient implements MusicClient {

    @Override
    public List<Playlist> getPlaylists() {
        return null;
    }

    @Override
    public List<Track> getTracksFromPlaylist(Playlist playlist) {
        return null;
    }

}
