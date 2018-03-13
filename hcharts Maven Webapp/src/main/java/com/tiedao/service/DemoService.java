package com.tiedao.service;

import java.util.List;

import com.tiedao.pojo.Demo;

public interface DemoService {

	public Demo getDemoById(int demoId);
	public List<Demo> findAll();
	List<Demo> selectAll();
}
