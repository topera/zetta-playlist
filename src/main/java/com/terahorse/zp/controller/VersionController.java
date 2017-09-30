/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.controller;

import com.terahorse.zp.model.zp.Version;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class VersionController {

    private static final Logger LOG = LoggerFactory.getLogger(VersionController.class);

    @RequestMapping("/api/version")
    public Version getVersion() {
        try {
            Path path = Paths.get(new ClassPathResource("version.txt").getFile().getPath());
            return new Version(new String(Files.readAllBytes(path)));
        } catch (IOException e) {
            LOG.error("Error getting version", e);
        }
        return null;
    }

}