package com.example.first.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Firstcontroller {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "sy");
        return "grettings";
    }

    @GetMapping("/bye")
    public String seeYouNext(){
        return"goodbye";
    }
}
