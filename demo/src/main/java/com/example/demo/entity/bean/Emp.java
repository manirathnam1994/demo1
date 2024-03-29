package com.example.demo.entity.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRAINEE_DEMO_EMP")
public class Emp
{
	@Id
	@Column(name="EMP_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	 

	@Column(name="EMP_NAME")
	private String name;
	
	@Column(name="EMP_DEPT")
	private String dept;
	
	@Column(name="EMP_SALARY")
	private int salary;
	
	public int getId()
	{  
	    return id;  
	}  
	
	public void setId(int id)
	{  
	    this.id = id;  
	}  
	public String getName() 
	{  
	    return name;  
	}  
	public void setName(String name) 
	{  
	    this.name = name;  
	}  
	public String getDept() {  
	    return dept;  
	}  
	public void setDept(String dept) {  
	    this.dept = dept;  
	}  
	  
	public int getSalary() {  
	    return salary;  
	}  
	public void setSalary(int salary) {  
	    this.salary = salary;  
	}  
}
