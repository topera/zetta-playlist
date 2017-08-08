package com.topera.zp.model.deezer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistsDeezer {

    private List<PlaylistDeezer> data;
    private Integer total;

    public List<PlaylistDeezer> getData() {
        return data;
    }

    public void setData(List<PlaylistDeezer> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}