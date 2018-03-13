package com.tiedao.service;

import com.tiedao.pojo.User;

public interface UserService {

	public User getUserById(int userId);

	public com.tiedao.pojo.User checkLogin(String name, String password);

}
