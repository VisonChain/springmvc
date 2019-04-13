package com.vs.controller;

import com.vs.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/addUser")
    public String addUser(Model model){
        List<User> list = new ArrayList<>();
        User u1 = new User();
        User u2 = new User();
        u1.setAddress("北京");
        u1.setAge(99);
        u1.setName("李白");
        u2.setAddress("上海");
        u2.setAge(88);
        u2.setName("杜甫");
        list.add(u1);
        list.add(u2);
        model.addAttribute("user",list);
        return "user";
    }
}
