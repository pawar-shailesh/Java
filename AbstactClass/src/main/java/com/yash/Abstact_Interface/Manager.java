package com.yash.Abstact_Interface;
/**
 * Implementing Abstract methods of Employee class in Manager class
 * @author shailesh.pawar
 *
 */
public class Manager extends Employee {

	  int man_id =007;
	  int man_salary =30000;
	  String desig ="Trainee";
	@Override
	void getId() {
	System.out.println(man_id);
		
	}

	@Override
	void getSal() {
		System.out.println(man_salary);
		
	}

	@Override
	void getDesg() {
		System.out.println(desig);
	}
         
	
}
