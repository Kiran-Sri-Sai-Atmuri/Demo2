package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class ExampleController {

    public ExampleController() {
        System.out.println("in example constructor");
    }


    @GetMapping("/")
    public String demo(){
        return "This is a Demo";
    }
}
