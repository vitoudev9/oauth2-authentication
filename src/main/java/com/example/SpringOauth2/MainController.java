package com.example.SpringOauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/oauth2/login")
    public String login() {
        return "login success";
    }

    @GetMapping("/")
    public String home() {
        return "login success";
    }
}
