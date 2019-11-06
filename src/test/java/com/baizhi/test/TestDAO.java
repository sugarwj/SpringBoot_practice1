package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestDAO {
    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        /*List<User> users = userDAO.selectAll();
        for (User user : users) {
            System.out.println(user);
        }*/
        //userDAO.save(new User("4","赵六","123","111111111111","sosnfsfd@aas.com","系统1","168.167.0.2","冻结"));
        //userDAO.delete("5");
        //userDAO.update(new User("1","赵六","123","22222222222","sosndfd@aas.com","系统3","168.167.0.5","冻结"));
       /* String[] ids={"1","3"};
        userDAO.deleteByIds(ids);*/
        User user = userDAO.selectOneUser("张三", "111");
        System.out.println(user);
    }

    @Test
    public void test2(){
       /* List<User> users = userService.selectAll();
        for (User user : users) {
            System.out.println(user);
        }*/
        //userService.add(new User("5","赵七","321","11611511611","sosnfsfd@aas.com","系统3","168.167.0.1","可用"));
        //userService.delete("4");
        //userService.update(new User("1","赵七","321","11611511611","sosnfsfd@aas.com","系统3","168.167.0.1","可用"));
        /*String[] ids={"2","4"};
        userService.deleteByids(ids);*/
        /*User user = userService.login("张三", "111");
        System.out.println(user);*/
        //userService.add(new User("1","王五","111","11111111","sofds@ss.com","系统1","123.234.0.1","可用"));
        for (int i=0;i<10;i++){
            List<User> users = userService.selectUsers();
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}
