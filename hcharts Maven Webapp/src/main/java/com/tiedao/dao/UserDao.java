package com.tiedao.dao;

import java.util.List;

import com.tiedao.pojo.User;

public interface UserDao {
	int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    
    List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    ///////////////////////////////////
    //�ӿڷ�����ͨ���û����õ�User����
    User findUserByName(String username);
    ///////////////////////////////////
}
