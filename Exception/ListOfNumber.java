package checkedUnchekedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListOfNumber
{
    private Scanner x;
    public void openFile()
    {
    	try {
			x=new Scanner(new File("flist.txt"));
		} catch (FileNotFoundException e) {
			
			System.out.println("FileNotFoundException");
		}
    	}
    public void readFile()
    {
    	while(x.hasNext())
    	{
    		String a=x.next();
    		String b=x.next();
    		//String c=x.next();
    		System.out.printf("%s %s\n" , a,b);
    		
    	}
    }
    public void closeFile()
    {
    	x.close();
    }
}
