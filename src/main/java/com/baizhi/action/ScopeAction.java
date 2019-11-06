package com.baizhi.action;

import com.baizhi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping("/scope")
public class ScopeAction {

    @RequestMapping("/s1")
    public String s1(HttpServletRequest request, HttpSession session) throws  Exception{
        request.setAttribute("name","王五");
        session.setAttribute("n","呵呵");
        return "scope";
    }

    @RequestMapping("/s2")
    public String s2(Model model, ModelMap Map) throws  Exception{
        User user1 = new User("1", "赵六", "123", "22222222222", "sosndfd@aas.com", "系统3", "168.167.0.5", "冻结");
        User user2 = new User("2", "王五", "123", "22222222222", "sosndfd@aas.com", "系统3", "168.167.0.5", "冻结");
        User user3 = new User("3", "张三", "123", "22222222222", "sosndfd@aas.com", "系统3", "168.167.0.5", "冻结");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        Map.addAttribute("users",users);
        return "scope";
    }
}
