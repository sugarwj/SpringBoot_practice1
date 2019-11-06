package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    public List<User>  selectAll(Integer page,Integer rows);

    public Integer totalcount();

    public void add(User user);

    public void delete(String id);

    public void update(User user);
     //批删
    public void deleteByids(String[] ids);

    public User login(String username,String password);

    public List<User>  selectUsers();
}
