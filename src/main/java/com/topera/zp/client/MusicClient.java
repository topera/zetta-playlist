package com.topera.zp.client;

import com.topera.zp.exceptions.ZPRequestError;
import com.topera.zp.model.zp.Playlist;
import com.topera.zp.model.zp.Playlists;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public interface MusicClient {

    default <T> T sendRequest(String url, Class<T> responseType) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            return restTemplate.getForObject(url, responseType);
        } catch (HttpClientErrorException e) {
            throw new ZPRequestError(e.getStatusCode().value());
        }
    }

    Playlists getPlaylists();

    Playlist getPlaylist(Long id);

}
