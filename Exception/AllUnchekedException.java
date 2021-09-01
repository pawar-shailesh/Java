package checkedUnchekedException;

import java.util.Scanner;

/**
 * Demo for the all uncheked exception with nested try catch block 
 *
 */

public class AllUnchekedException 
{
  public static void main(String args[])
  {
	  int[] marks= new int[5];      //Created arrry for handling all Exception on that array marks
	  marks[0]=60;
	  marks[1]=65;
	  marks[2]=70;
	  marks[3]=75;
	  marks[4]=80;       //(Integer) null;  //value 80  //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "null" is null
	 //3 marks[5]=85;     //if this line is uncommented than the exception is ArrayIndexOutOfBound
	  
	  Scanner sc=new Scanner(System.in);    //tacking input  array index from users;
	  System.out.println("Enter the index");
	  int ind=sc.nextInt();
	  
	  System.out.println("Enter the number want to divide with the value");
	  int number=sc.nextInt();          //number from user to want divide the value
	  
	  try {
       System.out.println("Array index which enter from user: "+marks[ind]);  //printed value of index
       System.out.println("Array index which enter from user: "+marks[ind]/number); //marks and number divided
       }
	  catch(ArithmeticException e)
	  {
		System.out.println("ArithmeticException Occourd!") ; //Array index which enter from user:75ArithmeticException Occourd!java.lang.ArithmeticException: / by zero
		System.out.println(e);
		
	  }
	  catch (ArrayIndexOutOfBoundsException e){
          System.out.println("ArrayIndexOutOfBoundsException occured!"); //ArrayIndexOutOfBoundsException occured!java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
          System.out.println(e);
      }
      catch (Exception e){
          System.out.println("Some other exception occured!"); //Enter the index 4 Enter the number want to divide with the value s Exception in thread "main" java.util.InputMismatchException
          System.out.println(e);
      }
  }
}

  
	  

