package checkedUnchekedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filedemo 
{
	public static void main(String args[]) throws IOException 
	   {
	    FileInputStream fis = null;
	    //Open a file 
	         fis = new FileInputStream("C:/myfile.txt"); 
	      
	    int k; 
	 
	    //read contents of the file
	        while(( k = fis.read() ) != -1) 
	    { 
	        System.out.print((char)k); 
	    } 
	 
	    //close the file
	    fis.close();    
	   }
	
}

