/**
 * Program which calculate rate of interest.
 */
import java.util.Scanner;
public class Simple {
	

	    public static void main(String args[]) 
	    {
	        float p, r, t, interest;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the Principal : ");
	        p = scan.nextFloat();
	        System.out.print("Enter the Rate of interest : ");
	        r = scan.nextFloat();
	        System.out.print("Enter the Time period : ");
	        t = scan.nextFloat();
	        scan.close();
	        interest = (p * r * t) / 100;
	        System.out.print("Simple Interest is: " +interest);
	    }
	}

