package com.yash.log.log4jexception;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jExceptionDemo {
	static Logger logger=Logger.getLogger(Log4jExceptionDemo.class);
	
	public void sub()
	{
		int a=10,b=12;
		int result=a+b;
		logger.info("Substraction :"+result);
	}

	
	public static void main(String[] args) 
	{
		Log4jExceptionDemo l=new Log4jExceptionDemo();
		//PropertyConfigurator.configure("log4j.properties");
		logger.info("This is log for Log4jExceptionDemo ");
		try
		{
			int c=23/0;
		}
		catch (Exception e) {
			logger.error("This is error :"+e);
		}
		int num1=12,num2=23;
		int result=num1+num2;
		logger.info("Addition :"+result);
		l.sub();
		
		
		logger.debug("This is warn message");
		logger.fatal("This is fatal message");

	}

}
