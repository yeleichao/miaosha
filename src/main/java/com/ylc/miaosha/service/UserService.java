package com.ylc.miaosha.service;

import com.ylc.miaosha.dao.UserDao;
import com.ylc.miaosha.dao.UserMapper;
import com.ylc.miaosha.domain.User;
import com.ylc.miaosha.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: TODO
 * @Date: 2019/4/21
 */
@Service
public class UserService {


    @Autowired
    private UserMapper userMapper;

    public boolean getUserByMobile(LoginVo vo){
        User user = userMapper.selectByPrimaryKey(Long.valueOf(vo.getMobile()));
        if(user.getPassword().equals(vo.getPassword())){
            return true;
        }
        return false;
    }


}
