package collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.*;

public class CustomerList implements Comparable<CustomerList>
{
	int custid;
	String cuts_name;
	int prodquntity;
	
	public CustomerList(int custid, String cuts_name, int prodquntity) {
		super();
		this.custid = custid;
		this.cuts_name = cuts_name;
		this.prodquntity = prodquntity;
	}

	@Override
	public String toString() {
		return "CustomerCollection [custid=" + custid + ", cuts_name=" + cuts_name + ", prodquntity=" + prodquntity
				+ "]";
		
		
	}
	
	
	
	
 @Override
	public int compareTo(CustomerList o) {
		if(prodquntity==o.prodquntity)
		 return 0;
		else if(prodquntity > o.prodquntity )
			return 1;
		else
			return -1;
		
	
		
	}

public static void main(String[] args)
 {
	 ArrayList<CustomerList> arr=new ArrayList<CustomerList>();
	 
	   arr.add(new CustomerList(1,"swati",20));
	   arr.add(new CustomerList(2,"smita",15));
	   arr.add(new CustomerList(3,"swapnali",5));
	   arr.add(new CustomerList(4,"Nikita",12));
	   arr.add(new CustomerList(5,"usha",9));
	   
	System.out.println("add method in customer");
	 
	     for(CustomerList c:arr)
		  System.out.println(c);
	     
	   System.out.println("camparable sorting.....");
	   
	   Collections.sort(arr);
	   for(CustomerList c:arr)
			  System.out.println(c);
		     
	   }
}
