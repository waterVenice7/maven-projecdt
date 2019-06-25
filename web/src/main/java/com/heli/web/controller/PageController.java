package com.heli.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:2019/6/22
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

}
