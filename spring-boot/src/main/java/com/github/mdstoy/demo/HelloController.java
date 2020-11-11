package com.github.mdstoy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class HelloController {

    /**
     * Hello.
     *
     * @return hello, world.
     */
    @GetMapping()
    public HelloResponse hello() {
        String ok = "It works!!";
        HelloResponse response = new HelloResponse();
        response.status = ok;
        response.now = LocalDateTime.now();
        return response;
    }
}
