package com.vs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;


@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/forward")
    public String forward(Model model){
        model.addAttribute("skill","睡觉");
        return "forward";
    }

    @RequestMapping("/redirect")
    public String redirect(Model model){
        model.addAttribute("skill","吃饭");
        return "redirect:/jsp/redirect.jsp";
    }

    @RequestMapping("/forward2")
    public String forwardAnthorController(Model model){
        return "forward:/user/addUser";
    }


}
