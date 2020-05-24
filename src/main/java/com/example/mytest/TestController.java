package com.example.mytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        int s = 0; //step 1
        int s2 = 2;//step 2
        int s3 = 3;//step 3
        System.out.println("666...");
        return "haha...";
    }
}

