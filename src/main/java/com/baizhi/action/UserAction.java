package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(String username, String  password, HttpSession session) throws Exception{
        User user = userService.login(username, password);
        if(user!=null){
             session.setAttribute("flag","Y");
            return "showAll";
        }else{
            return "login";
        }

    }

    @RequestMapping("/showAll")
    @ResponseBody
    public Map<String, Object> add(Integer page, Integer rows) throws Exception {
        //创建Map集合
        HashMap<String, Object> maps = new HashMap<>();
        List<User> users = userService.selectAll(page, rows);
        //获取总条数
        Integer totalcount = userService.totalcount();
        //计算总页数
        Integer pages;
        if (totalcount % rows == 0) {
            pages = totalcount / rows;
        } else {
            pages = totalcount / rows + 1;
        }
        //设置总页数
        maps.put("total", pages);
        //设置总条数
        maps.put("records", totalcount);
        //当前页号
        maps.put("page", page);
        //当前页的数据
        maps.put("rows", users);
        return maps;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public void edit(String oper, User user) throws Exception {
        if ("add".equals(oper)) {
            userService.add(user);
        } else if ("edit".equals(oper)) {
            userService.update(user);
        } else if ("del".equals(oper)) {
            userService.delete(user.getId());
        }
    }
}
