package com.mog.rstq.norriv.summerProject.controller;

import com.mog.rstq.norriv.summerProject.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestController {

    @GetMapping
    public String home(){
        return "Hello from TestController";
    }

}
