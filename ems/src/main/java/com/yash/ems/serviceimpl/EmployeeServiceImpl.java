package com.yash.ems.serviceimpl;

import java.beans.Customizer;
import java.util.*;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.java.ems.model.Employee;
import com.yash.ems.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService
{
	Scanner sc=new Scanner(System.in);
		ArrayList<Employee> e=new ArrayList<Employee>();
		{
		e.add(new Employee(1,"Alex",30000,"Software Engineer","Dev","Pune"));
		e.add(new Employee(2,"Shailesh",30000,"Testing","Test","Pune"));
		e.add(new Employee(3,"Kushagra",50000,"Software Engineer","Dev","Mumbai"));
		e.add(new Employee(4,"Ajay",30000,"Software Engineer","Dev","Indore"));
		e.add(new Employee(5,"Pooja",45000,"Software Engineer","Accounnt","Pune"));
		e.add(new Employee(6,"Martin",50000,"Tester","Testing","Jabalpur"));
		e.add(new Employee(7,"Sanjay",50000,"Software Engineer","Dev","Hydrabad"));
		}
	@Override
	public void getAllEmployee() {
		e.stream().forEach(emp->System.out.println(emp));
		
	}

	@Override
	public void getEmployeeById()
	{
		System.out.println("Employee ID :");
		int empId=sc.nextInt();
	
		Employee empById=e.stream().filter(id->id.getId()==empId).collect(Collectors.toList()).get(0);
		System.out.println(empById);
			
	}

	@Override
	public void getEmployeeBySalary() 
	{
		System.out.println("Employee Salary :");
		double empSalary=sc.nextInt();
	
		Employee emp=e.stream().filter(salary->salary.getSalary()==empSalary).collect(Collectors.toList()).get(0);
		System.out.println(emp);
	}
	@Override
	public void getEmployeeByName() {
		System.out.println("Enter Employee Name :");
		String name=sc.next();
		ArrayList<Employee> empByName=(ArrayList<Employee>)e.stream().filter(t->t.getName().equals(name)).collect(Collectors.toList());
		empByName.stream().forEach(t->System.out.println(t));
	}

	@Override
	public void getEmployeeByDept() {
		System.out.println("Enter Employee Department..");
		String dept=sc.next();
		ArrayList<Employee> empByDept=(ArrayList<Employee>)e
				.stream()
				.filter(t->t.getDepartment()
				.equals(dept))
				.collect(Collectors.toList());
		empByDept.stream().forEach(t->System.out.println(t));
		
	}

	@Override
	public void getHighestEmpSalary() 
	{
		System.out.println(e.stream().mapToDouble(e->e.getSalary()).max().getAsDouble());
		
	}
}
