package com.vs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bye")
public class ByeController {

    @RequestMapping("/model")
    public String bye(Model model){
        model.addAttribute("model","modeller");
        return "bye";
    }

    @RequestMapping("/boy")
    public String goodBye(Model model){
        model.addAttribute("boy","心机男孩");
        return "bye";
    }

}
