package com.zp.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by rafael on 18/06/17.
 */
@XmlRootElement
class Data<T> {

    private List<T> data;
    private Integer total;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}