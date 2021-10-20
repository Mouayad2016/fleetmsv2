package com.kndsonthegenius.fleetmsv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplecationController {
    @GetMapping ("/index")
    public String home(){
        return "index";
    }
    @GetMapping ("/widgets")
    public String widget (){
        return "widgets";
    }





}
