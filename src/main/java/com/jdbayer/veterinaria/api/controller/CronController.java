package com.jdbayer.veterinaria.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/cron")
public class CronController {

    @Autowired
    private BCryptPasswordEncoder passEncoder;

    @GetMapping
    public Date cron() {
        return new Date();
    }
}
