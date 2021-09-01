package com.yash.ems.service;

import java.util.List;
import com.java.ems.model.Employee;


public interface EmployeeService 
{
	public void getAllEmployee();
	public void getEmployeeById();
	public void getEmployeeBySalary();
	public void getEmployeeByName();
	public void getEmployeeByDept();
	public void getHighestEmpSalary();
	
}
