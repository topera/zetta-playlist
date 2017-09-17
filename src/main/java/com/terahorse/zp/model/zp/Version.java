/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.model.zp;

public class Version {

    private String name;

    @SuppressWarnings("unused") // used in tests
    public Version() {
    }

    public Version(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
