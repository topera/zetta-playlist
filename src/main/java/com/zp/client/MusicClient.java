package com.zp.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.zp.exceptions.ZPRequestError;
import com.zp.model.Playlist;
import com.zp.model.Playlists;
import com.zp.model.Track;

import java.util.List;

/**
 * Generic client to access several Streaming Music APIs
 * Created by rafael on 18/06/17.
 */
public abstract class MusicClient {

    /**
     * Send request to external server
     * @param url target url
     * @param expectedClass class to unserialize result
     * @return object with result
     */
    public Object sendRequest(String url, Class expectedClass) {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        return getEntity(webResource, expectedClass);
    }

    /**
     * Read entity from response
     * @param webResource webResource used in request
     * @param expectedClass expected class in result
     * @return object with result
     */
    private Object getEntity(WebResource webResource, Class expectedClass) {
        ClientResponse response = webResource.get(ClientResponse.class);
        if (response.getStatus() != 200) {
            throw new ZPRequestError(response.getStatus());
        }
        return response.getEntity(expectedClass);
    }

    /**
     * Gets all playlists
     * @return list of playlists
     */
    public abstract Playlists getPlaylists();

    /**
     * Gets all tracks of the specified playlist
     * @param playlist playlist to get tracks
     * @return list of tracks
     */
    abstract List<Track> getTracksFromPlaylist(Playlist playlist);

}
