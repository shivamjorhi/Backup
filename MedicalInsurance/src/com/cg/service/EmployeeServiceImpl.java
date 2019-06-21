package com.cg.service;
import com.cg.bean.*;
import java.util.*;
public class EmployeeServiceImpl implements  EmployeeService{
Scanner in=new Scanner(System.in);
	@Override
	public void getdetails() {
		// TODO Auto-generated method stub
		System.out.println("enter the details for user");
		int eid=in.nextInt();
		String name=in.nextLine();
		double salary=in.nextDouble();
		String designation=in.nextLine();
		Employee e=new Employee(eid,name,salary,designation);		
		
	}

	@Override
	public String calculateScheme(Employee e) {
		// TODO Auto-generated method stub
		String scheme="";
		if(e.getSalary()>5000 && e.getSalary()<20000 && e.getDesignation().equals("System Associate"))
		{
			scheme="Scheme C";
		}
		else if(e.getSalary()>=20000 && e.getSalary()<40000 && e.getDesignation().equals("Programmer"))
		{
			scheme="Scheme B";
		}
		else if(e.getSalary()>=40000 && e.getDesignation().equals("Manager"))
		{
			scheme="Scheme A";
		}
		else
		{
			scheme="No Scheme";
		}
		return scheme;
	}
	

}