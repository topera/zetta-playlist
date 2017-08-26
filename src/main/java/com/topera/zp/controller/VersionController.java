package com.topera.zp.controller;

import com.topera.zp.model.zp.Version;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class VersionController {

    @RequestMapping("/api/version")
    public Version list() {
        try {
            Path path = Paths.get(new ClassPathResource("version.txt").getFile().getPath());
            return new Version(new String(Files.readAllBytes(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}