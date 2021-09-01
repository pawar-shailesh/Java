package checkedUnchekedException;

import java.util.Scanner;

public class ArraySizeInput
{
   public  static void main(String args[])
   {
	  Scanner input=new Scanner(System.in);
	  int sizea=5;
	  int[] arr;
	  System.out.println("Enter size of Array");
	  try {
		  arr=new int[sizea];
		   }
	  catch(NegativeArraySizeException e)
	       {
		  System.out.println("negative size array");
		  return;
	       }
	  catch(NumberFormatException  e)
      {
	  System.out.println("Format not right");
	  return;
      }
	  System.out.println("Array Created Succesfully .Enter value in array");
	  for(int i=0;i<sizea;i++)
	  arr[i]=input.nextInt();
	  System.out.println("enter index");
	  sizea=input.nextInt();
	  try {
		  System.out.println(arr[sizea-1]);
		  
	     }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		   System.out.println("enter index is wrong");
		   System.out.println(e);
	  }
		  
	  
	  
	  
   }
}
