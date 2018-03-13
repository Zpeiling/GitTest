package com.tiedao.dao;

import java.util.List;

import com.tiedao.pojo.Demo;

public interface DemoDao {
	Demo findDemoById(int id);
	public List<Demo> findAll();
	List<Demo> selectAll();
}
