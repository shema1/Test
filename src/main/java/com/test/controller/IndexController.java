package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Mykola on 22.06.2017.
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
