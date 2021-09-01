package checkedUnchekedException;

public class DoubleInput 
{ 
	public static void main(String args[])
	{
		try {
			  
            String str = "Allen";
  
            double val = Double.parseDouble(str);
  
            System.out.println("Value = " + val);
        }
        catch (NumberFormatException e) {
        	System.out.println("NumberFormatException Occured !" );
            System.out.println("Exception: " + e);
        }
    }
	}


