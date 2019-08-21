package com.example.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.bean.Emp;

@Repository
public class DemoDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public String addemp(Emp emp)
	{
		Session session = this.sessionFactory.getCurrentSession();
						
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDept()+" "+emp.getSalary());
		
		session.save(emp);			
		return "Employee Details are added";		
	}
 
	@SuppressWarnings("unchecked")
	public List<Emp> display() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Emp>  employeeList = session.createQuery("from Emp").list();
		return employeeList;
	}

}
