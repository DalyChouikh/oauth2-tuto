package dev.daly.oauth2tuto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class Oauth2TutoController {

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World");
    }
}
