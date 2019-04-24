package com.ylc.miaosha.dao;

import com.ylc.miaosha.domain.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    int countByExample(User example);

    int deleteByExample(User example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(User example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") User example);

    int updateByExample(@Param("record") User record, @Param("example") User example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}