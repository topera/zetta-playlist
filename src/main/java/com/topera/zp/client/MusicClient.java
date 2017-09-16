package com.topera.zp.client;

import com.topera.zp.exceptions.ZPRequestError;
import com.topera.zp.model.zp.Playlist;
import com.topera.zp.model.zp.Playlists;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public abstract class MusicClient {

    private RestTemplate restTemplate = new RestTemplate();

    <T> T sendRequest(String url, Class<T> responseType) {
        try {
            return restTemplate.getForObject(url, responseType);
        } catch (HttpClientErrorException e) {
            throw new ZPRequestError(e.getStatusCode().value());
        }
    }

    public abstract Playlists findPlaylists();

    public abstract Playlist findPlaylist(Long id);

}
