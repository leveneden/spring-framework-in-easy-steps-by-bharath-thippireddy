package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String greet(@RequestParam final Optional<String> name) {
        return "Hello " + name.orElse("user") + "!";
    }
}
