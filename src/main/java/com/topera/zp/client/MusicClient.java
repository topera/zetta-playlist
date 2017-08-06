package com.topera.zp.client;

import com.topera.zp.model.zp.Playlist;
import com.topera.zp.model.zp.Playlists;

import org.springframework.web.client.RestTemplate;

/**
 * Created by topera on 18/06/17.
 */
public interface MusicClient {

    default <T> T sendRequest(String url, Class<T> responseType) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, responseType);
    }

    Playlists getPlaylists();

    Playlist getPlaylist(Long id);

}
