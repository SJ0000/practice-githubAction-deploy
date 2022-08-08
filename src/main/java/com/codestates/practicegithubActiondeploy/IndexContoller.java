package com.codestates.practicegithubActiondeploy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexContoller {
    @GetMapping("/")
    public String index(){
        return "Hello world";
    }
}
