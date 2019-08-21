package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DemoDao;
import com.example.demo.entity.bean.Emp;

@Service
@Transactional
public class ServiceImp implements DemoService 
{
	@Autowired
	private DemoDao dao;
	
	public List<Emp> display() {
		// TODO Auto-generated method stub
		return dao.display();
	}

	public String addemp(Emp emp) {
		
		return dao.addemp(emp);
		
	}

}
