package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {
    //展示所有
    public List<User> selectAll(@Param("page")Integer page,@Param("rows")Integer rows);
    //查询总条数
    public Integer totalcount();

    public void save(User user);

    public void delete(String id);

    public void update(User user);

    public void deleteByIds(String[] ids);

    public User selectOneUser(@Param("username") String username,@Param("password") String passsword);

    public List<User>  selectUsers();
}
