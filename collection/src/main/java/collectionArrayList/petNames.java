package collectionArrayList;

import java.util.ArrayList;

/**
 * class petname is created for collection on arraylist
 * @author usha.more
 *
 */

public class petNames 
{
  public static void main(String[] args)
  {
	  ArrayList<String> pname=new ArrayList<String>();  //pet name arraylist decalaration
      pname.add("mangu");
      pname.add("tommy");
      pname.add("lucky");
      pname.add("ladu");
      
      System.out.println(pname);  //printed the name of pet
      
      pname.add(2,"sofi");   //add another name inbetween array
      System.out.println("After adding name index 2:"+pname);
      
      pname.set(0, "sheru");   //update the valute or change the value at index 0
      System.out.println("After changing  name index 0:"+pname);
      
      pname.remove("ladu");   //remove elements by using name
      System.out.println("remove the element ladu:"+pname);
      
      pname.remove(3); //remove element by using index
      System.out.println("remove element  at index:"+pname);
      
      pname.add("rani");   //if i am not provinding index than it's add at last
      System.out.println("add element"+pname);
      
      System.out.println("size of arraylist:"+pname.size());
  }
}
