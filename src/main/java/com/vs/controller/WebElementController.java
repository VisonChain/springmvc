package com.vs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/web")
public class WebElementController {

    @RequestMapping("/request1")
    public String request(WebRequest request){
        System.out.println(request.getParameter("girl"));
        return "forward";
    }

    @RequestMapping("/request2")
    public String request(HttpServletRequest request){
        System.out.println(request.getParameter("boy"));
        return "forward";
    }

    @RequestMapping("/request3")
    public String request(HttpSession session){
        session.setAttribute("game","剑来");
        return "redirect:/jsp/redirect.jsp";
    }

}
