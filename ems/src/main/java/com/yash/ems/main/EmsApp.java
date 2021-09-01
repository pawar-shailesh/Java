package com.yash.ems.main;
/**
 * 
 * @author shailesh.pawar
 */
import com.yash.ems.serviceimpl.EmployeeServiceImpl;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.*;
public class EmsApp 
{
	public static void main(String[] args) throws Exception 
	{

		while(true)
		{
			EmployeeServiceImpl service=new EmployeeServiceImpl();
			System.out.println("********************************");
			System.out.println("1.Show All Employee");
			System.out.println("2.Employee By ID");
			System.out.println("3.Employee By Name");
			System.out.println("4.Employee By Department");
			System.out.println("5.Highest Salary Employee");
			System.out.println("6.Employee By Salary");
			System.out.println("7.Exit");
			System.out.println("********************************");
			System.out.println("\nEnter Your Choice :");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch (choice) 
			{
			case 1:
				service.getAllEmployee();
				break;

			case 2:
				try
				{
				service.getEmployeeById();
				break;
				}
				catch (Exception e) {
					System.out.println(e);
				}

			case 3:
				service.getEmployeeByName();
				break;

			case 4:
				service.getEmployeeByDept();
				break;
				
			case 5:
				service.getHighestEmpSalary();
				break;
				
			case 6:
				service.getEmployeeBySalary();
				break;
				
			case 7:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice!!!!!!!!!!");
				break;
			}
		}
	}
}

