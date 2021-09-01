package com.yash.java8.lambdaexpression;
interface demo
{
	public int showMsg(int num1,int num2);
}
public class LambdaDemo
{	
	public static void main(String[] args)
	{
		demo d=(num1,num2)->{
			return num1+num2;
		};
		demo d1=(num1,num2)->{
			return num1-num2;
		};
		demo d2=(num1,num2)->{
			return num1*num2;
		};
		demo d3=(num1,num2)->{
			return num1/num2;
		};
		System.out.println("Addition :"+d.showMsg(10,20));
		System.out.println("Substraction :"+d1.showMsg(10,23));
		System.out.println("Multiplication :"+d2.showMsg(34,23));
		System.out.println("Division :"+d3.showMsg(65,0));
	}
}
