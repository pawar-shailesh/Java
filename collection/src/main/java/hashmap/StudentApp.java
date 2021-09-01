package hashmap;

import java.util.HashMap;

public class StudentApp 
{
	public static void main(String[] args)
	{
		HashMap<Integer,Student> h=new HashMap<Integer,Student>();
		
		Student s1=new Student(1,"usha","pune");
		Student s2=new Student(2,"neha","mumbai");
		Student s3=new Student(3,"nikita","solapur");
		Student s4=new Student(4,"swapnali","latur");
		
		h.put(1,s1);
		h.put(2, s2);
		h.put(3, s3);
		h.put(4, s4);
		
		System.out.println(h.get(1));
		
		
		
		
	}

}
