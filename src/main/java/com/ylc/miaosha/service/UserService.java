package com.ylc.miaosha.service;

import com.ylc.miaosha.dao.UserDao;
import com.ylc.miaosha.vo.User;
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
    private UserDao userDao;

    public List<User> getUsers (){
       return userDao.getUser();
    }

    @Transactional
    public void insertUsers(){
        User user1 = new User();
        user1.setId("2");
        user1.setName("222");
        userDao.insert(user1);

        User user2 = new User();
        user2.setId("1");
        user2.setName("111");
        userDao.insert(user2);
    }
}
