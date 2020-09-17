package com.github.mdstoy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping()
    public String hello() {
        return String.format("hello, world. [%s]", LocalDateTime.now());
    }
}
