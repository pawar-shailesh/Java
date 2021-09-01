package com.java.ems.model;
/**
 * Employee POJO
 * @author shailesh.pawar
 */
import java.util.Objects;

public class Employee 
{ 
	private int id;
	private String name;
	private double salary;
	private String desiganation;
	private String department;
	private String address;
	
	
	public Employee(int id, String name, double salary, String desiganation, String department, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.desiganation = desiganation;
		this.department = department;
		this.address = address;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(address, department, desiganation, id, name, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(department, other.department)
				&& Objects.equals(desiganation, other.desiganation) && id == other.id
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", desiganation=" + desiganation
				+ ", department=" + department + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesiganation() {
		return desiganation;
	}

	public void setDesiganation(String desiganation) {
		this.desiganation = desiganation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
