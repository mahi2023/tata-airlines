package com.example.tataproject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class mymeal {
    @GetMapping ("/mymeal")
    public String getData(){
        return " get ur meal on time , per bhar khao  ";
    }


}
