package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jump")
public class JumpAction {

    @RequestMapping("/A")
    public String A() throws Exception{
        System.out.println("我是a");
        return "redirect:/index.jsp";
    }

    @RequestMapping("/B")
    public String B() throws Exception{
        System.out.println("我是b");
        return "redirect:/jump/C";
    }

    @RequestMapping("/C")
    public String C() throws Exception{
        System.out.println("我是c");
        return "index";
    }
}
