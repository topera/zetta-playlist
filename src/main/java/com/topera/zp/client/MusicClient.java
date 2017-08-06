package com.topera.zp.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.topera.zp.exceptions.ZPRequestError;
import com.topera.zp.model.zp.Playlist;
import com.topera.zp.model.zp.Playlists;

/**
 * Created by topera on 18/06/17.
 */
public abstract class MusicClient {

    public Object sendRequest(String url, Class expectedClass) {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        return getEntity(webResource, expectedClass);
    }

    private Object getEntity(WebResource webResource, Class expectedClass) {
        ClientResponse response = webResource.get(ClientResponse.class);
        if (response.getStatus() != 200) {
            throw new ZPRequestError(response.getStatus());
        }
        return response.getEntity(expectedClass);
    }

    public abstract Playlists getPlaylists();

    public abstract Playlist getPlaylist(Long id);

}
