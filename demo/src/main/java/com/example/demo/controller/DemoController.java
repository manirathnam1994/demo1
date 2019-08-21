/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.bean.Emp;
import com.example.demo.service.DemoService;
import com.example.demo.service.ServiceImp;

@RestController
public class DemoController
{
	@Autowired
	DemoService service;
	
	@Autowired
	ServiceImp serviceImpl;
		
	@RequestMapping(method = RequestMethod.POST, value = "/init", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Emp> helloWorld(@RequestBody String name) 
	{
		List<Emp> list =service.display() ;			
		return list;
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/save", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String store(@RequestBody Emp emp) 
	{
		String str=service.addemp(emp);
		return str;
	} 


}
