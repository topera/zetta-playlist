/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.model.deezer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistsDeezer {

    private List<PlaylistDeezer> data;

    public List<PlaylistDeezer> getData() {
        return data;
    }

    public void setData(List<PlaylistDeezer> data) {
        this.data = data;
    }

}