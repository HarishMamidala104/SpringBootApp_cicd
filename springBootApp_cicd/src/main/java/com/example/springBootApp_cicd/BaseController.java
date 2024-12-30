package com.example.springBootApp_cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class BaseController {
    @GetMapping("/welcome")
    public String getinfo(){
        return "Welcome to ci/cd pipeline.....!";
    }
}
