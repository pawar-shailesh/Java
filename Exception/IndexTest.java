package checkedUnchekedException;

import java.util.Scanner;

public class IndexTest
{
   public static void main(String args[])
   {
	   String[] name= {"allen","nikita","soham","smita","swati","rekha","jyoti","swapnali","anvit","Pranali"};
	   System.out.println(name[0]);
	   System.out.println(name[1]);
	   System.out.println(name[2]);
	   System.out.println(name[3]);
	   System.out.println(name[4]);
	   System.out.println(name[5]);
	   System.out.println(name[6]);
	   System.out.println(name[7]);
	   System.out.println(name[8]);
	   System.out.println(name[9]);
	  // System.out.println(name[10]);
	 try {  
	   Scanner sc=new Scanner(System.in);    //tacking input  array index from users;
		  System.out.println("Enter the index");
		  int ind=sc.nextInt();
		  System.out.println("Array index which enter from user: "+name[ind]); 
		  }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println("ArrayIndexOutOfBoundsException Occured !");
		 System.out.println(e);
		 
	 }
}
}
