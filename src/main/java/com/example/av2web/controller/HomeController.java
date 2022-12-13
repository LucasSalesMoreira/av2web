package com.example.av2web.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public void showHomePage(HttpServletResponse response) throws IOException {
        response.sendRedirect("/public/index.html");
    }
}
