package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class controller {

    @RequestMapping("/test")
    public String handler()
    {
     return "Only for testing the controller!!";
    }
}
 