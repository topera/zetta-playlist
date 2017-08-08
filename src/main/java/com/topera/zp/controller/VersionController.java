package com.topera.zp.controller;

import com.topera.zp.model.zp.Version;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @RequestMapping("/api/version")
    public Version list() {
        return new Version("0.0.3");
    }

}