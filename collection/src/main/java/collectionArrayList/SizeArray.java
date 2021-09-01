package collectionArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class SizeArray 
{
   public static void main(String[] args)
   {
	   
	   System.out.println("default size of arraylist");
	   List<String> list=new ArrayList<String>();
	   System.out.println(list.size());
	   
	   System.out.println("arraylist intilaize with 5");
	   List<String> list1=new ArrayList<String>(5);
	   System.out.println(list1.size());
	   
	   System.out.println("arraylist assinging data");
	   List<String> list2=new ArrayList<String>(5);
	   list2.add("1");
	   list2.add("1");
	   list2.add("1");
	   list2.add("1");
	   list2.add("1");
	   System.out.println(list2.size());
	   
	   System.out.println("not use for special data type");
	   ArrayList arraylist1 = new ArrayList();
	   System.out.println(arraylist1.size());
	   
	   
	   System.out.println("assign 5+ value");
	   
	   ArrayList arraylist2 = new ArrayList();
	   arraylist2.add("usha");
	   arraylist2.add(1);
	   arraylist2.add(3.5);
	   arraylist2.add(3000);
	   arraylist2.add(2);
	   arraylist2.add(3);
	   arraylist2.add(4);
	   arraylist2.add("nikita");
	   arraylist2.add(2);
	   arraylist2.add(4.5);
	   System.out.println(arraylist2.size());
	   
      System.out.println("assign 10+ value");
	   
	   ArrayList arraylist3 = new ArrayList();
	   arraylist3.add("usha");
	   arraylist3.add(1);
	   arraylist3.add(3.5);
	   arraylist3.add(3000);
	   arraylist3.add(2);
	   arraylist3.add(3);
	   arraylist3.add(4);
	   arraylist3.add("nikita");
	   arraylist3.add(2);
	   arraylist3.add(4.5);
	   arraylist3.add(5000);
	   arraylist3.add(5);
	   arraylist3.add(6.9);
	   arraylist3.add("smita");
	   arraylist3.add("sweta");
	   arraylist3.add(1000);
	   arraylist3.add("dipali");
	   arraylist3.add(1000);
	   System.out.println(arraylist3.size());
	   
	   arraylist3.ensureCapacity(500);
	   System.out.println("array capacity is increase..");
	  
	   
	   
	   
	   
	   
   }


	
}

