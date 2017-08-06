package com.topera.zp.client;

import com.topera.zp.model.zp.Playlist;
import com.topera.zp.model.zp.Playlists;

/**
 * Created by topera on 18/06/17.
 */
public abstract class MusicClient {

    public Object sendRequest(String url, Class expectedClass) {
        return null;
    }

//    private Object getEntity(WebResource webResource, Class expectedClass) {
//        ClientResponse response = webResource.get(ClientResponse.class);
//        if (response.getStatus() != 200) {
//            throw new ZPRequestError(response.getStatus());
//        }
//        return response.getEntity(expectedClass);
//    }

    public abstract Playlists getPlaylists();

    public abstract Playlist getPlaylist(Long id);

}
