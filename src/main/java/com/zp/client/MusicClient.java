package com.zp.client;

import com.zp.model.Playlist;
import com.zp.model.Track;

import java.util.List;

/**
 * Generic client to access several Streaming Music APIs
 * Created by rafael on 18/06/17.
 */
interface MusicClient {

    /**
     * Possible types of music clients
     */
    enum Type {
        DEEZER,
        SPOTIFY
    }

    /**
     * Gets all playlists of the authenticated user
     * @return list of playlists
     */
    List<Playlist> getPlaylists();

    /**
     * Gets all tracks of the specified playlist
     * @param playlist playlist to get tracks
     * @return list of tracks
     */
    List<Track> getTracksFromPlaylist(Playlist playlist);

}
