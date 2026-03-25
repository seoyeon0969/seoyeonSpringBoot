package com.example.first.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Firstcontroller {
    @GetMapping("/hi")
    public String niceToMeetYou(){
        return"grettings";
    }
}
