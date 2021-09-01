package collectionArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class petName2 
{
	public static void main(String[] args)
	  {
		  ArrayList<String> pobject=new ArrayList<String>();  //pet name arraylist decalaration
	      pobject.add("mangu");
	      pobject.add("tommy");
	      pobject.add("lucky");
	      pobject.add("ladu");
	      
	      
	      System.out.println("My ArrayList is:");
	      for(String str:pobject)
	      System.out.println(str);
	    	
	      pobject.add(0,"sofi"); //providing index number
	      pobject.add("rani");   //without index number
	      
	      System.out.println("My ArrayList is after adding data :");
	      for(String str:pobject)
	      System.out.println(str);
	      
	      pobject.remove(2);
	      pobject.remove("lucky");
	      System.out.println("remove elements at same position 2 time by providing index and name :");
	      for(String str:pobject)
	      System.out.println(str);
	      
	    Collections.sort(pobject); 
	    System.out.println("after sorting data :");
	      for(String str:pobject)
	      System.out.println(str);
	      
	      String str=pobject.get(3);
	      System.out.println(str);
	      
	      
	     
	    //custom type object creation
	      System.out.println("Different data type elements");
	      ArrayList arraylist1 = new ArrayList();
	      arraylist1.add(5);  
	      arraylist1.add("saman");     
	      arraylist1.add(4.3);
	      arraylist1.add("rani");
	      System.out.println(arraylist1);      
	      
	  }
	
}
