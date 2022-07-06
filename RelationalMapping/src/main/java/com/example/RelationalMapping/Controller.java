package com.example.RelationalMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/test")
    public String run()
    {
        return "The system is running fine";
    }
}
