/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.client;

import com.terahorse.zp.Application;
import com.terahorse.zp.exception.ZPRequestError;
import com.terahorse.zp.model.zp.Playlist;
import com.terahorse.zp.model.zp.Playlists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public abstract class MusicClient {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    private RestTemplate restTemplate = new RestTemplate();

    <T> T sendRequest(String url, Class<T> responseType) {
        try {
            return restTemplate.getForObject(url, responseType);
        } catch (HttpClientErrorException e) {
            LOG.error("Error in request", e);
            throw new ZPRequestError(e.getStatusCode().value());
        }
    }

    public abstract Playlists findPlaylists();

    public abstract Playlist findPlaylist(Long id);

}
