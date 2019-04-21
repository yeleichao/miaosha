package com.ylc.miaosha.dao;

import com.ylc.miaosha.vo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description: TODO
 * @Date: 2019/4/21
 */
@Mapper
public interface UserDao {

    @Select("select * from User")
    public List<User> getUser();


    public void insert(User user);

}
