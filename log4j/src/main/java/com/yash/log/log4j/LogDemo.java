package com.yash.log.log4j;

import org.apache.log4j.Logger;

class Demo extends Thread
{
	public void run() {
		Logger log=Logger.getLogger(LogDemo.class);
		
	}
	}
public class LogDemo {
	
	static Logger logger=Logger.getLogger(LogDemo.class);

	public static void main(String[] args) 
	{
		System.out.println("Logger Executed");
		logger.warn("This is warning message");
		logger.error("This is error");
		logger.debug("This is warn message");
		logger.fatal("This is fatal message");
		logger.info("this is the log for LogDemo");
		System.out.println("Completed");
	
	}

}
