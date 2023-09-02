package com.learning.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubeController {

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi";
    }
    @GetMapping("/bye")
    public String sayBye(){
        return "Bye";
    }
    @GetMapping("/bangalore")
    public String goBangalore(){
        return "Bangalore";
    }
    @GetMapping("/chennai")
    public String goChennai(){
        return "Chennai";
    }
}
