/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.model.zp;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Playlists {

    private List<Playlist> data;

    public Playlists() {
    }

    public Playlists(List<Playlist> data) {
        this.data = data;
    }

    public List<Playlist> getData() {
        return data;
    }

    public void setData(List<Playlist> data) {
        this.data = data;
    }

}