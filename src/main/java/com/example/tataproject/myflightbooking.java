package com.example.tataproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myflightbooking {
    @GetMapping ("/myflightbooking")
    public String getData(){
        return " book u r flight here  ";
    }

}
