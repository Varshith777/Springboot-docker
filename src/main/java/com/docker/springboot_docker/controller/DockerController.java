package com.docker.springboot_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/docker-demo")
    public String getValues()
    {
        return "Testing the Docker Application";
    }

}
