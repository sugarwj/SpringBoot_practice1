package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class JspAction {

    //推送本地修改

    @RequestMapping("/jsp")
    public  String jsp() throws Exception{
        System.out.println("this is the first jsp !");
        return "index";
    }
}
