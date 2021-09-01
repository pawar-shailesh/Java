package collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public  class CustomerSort implements Comparator<CustomerList>
{
	int custid;
	String cuts_name;
	int prodquntity;
	
	public CustomerSort(int custid, String cuts_name, int prodquntity) {
		super();
		this.custid = custid;
		this.cuts_name = cuts_name;
		this.prodquntity = prodquntity;
	}

	@Override
	public String toString() {
		return "CustomerSort [custid=" + custid + ", cuts_name=" + cuts_name + ", prodquntity=" + prodquntity + "]";
	}

	 static Comparator<CustomerSort> CustomerSorteNameComparator = new Comparator<CustomerSort>() {
	
	@Override
	
	public int compare(CustomerSort o1, CustomerSort o2) 
	{
		return o1.cuts_name.compareTo(o2.cuts_name);
	}
	};
	

	public static void main(String[] args)
	 {
		 ArrayList<CustomerSort> arr=new ArrayList<CustomerSort>();
		 
		   arr.add(new CustomerSort(1,"swati",20));
		   arr.add(new CustomerSort(2,"smita",15));
		   arr.add(new CustomerSort(3,"swapnali",5));
		   arr.add(new CustomerSort(4,"Nikita",12));
		   arr.add(new CustomerSort(5,"usha",9));
		   
		System.out.println("add method in customer");
		Collections.sort(arr,CustomerSorteNameComparator);
		     for(CustomerSort c1:arr)
			  System.out.println(c1);
}

	@Override
	public int compare(CustomerList o1, CustomerList o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

