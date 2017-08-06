package com.topera.zp.model.zp;

import java.util.List;

/**
 * Created by topera on 19/06/17.
 */
public class Playlists {

    private List<Playlist> data;

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