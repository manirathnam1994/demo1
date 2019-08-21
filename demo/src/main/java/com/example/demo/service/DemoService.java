package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.bean.Emp;

public interface DemoService {
	
	public List<Emp> display();
	
	public String addemp(Emp emp);
}
