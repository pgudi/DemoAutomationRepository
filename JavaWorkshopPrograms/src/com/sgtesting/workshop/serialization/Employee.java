package com.sgtesting.workshop.serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String firstname;
	int age;
	String deptname;
	public Employee(String fn,int age,String deptname)
	{
		firstname=fn;
		this.age=age;
		this.deptname=deptname;
	}
	
	public void showFN()
	{
		System.out.println("First Name of Employee :"+firstname);
	}
	
	public void showAge()
	{
		System.out.println("Age of the Employee :"+this.age);
	}
	
	public void showDept()
	{
		System.out.println("Department of Employee :"+this.deptname);
	}
}
