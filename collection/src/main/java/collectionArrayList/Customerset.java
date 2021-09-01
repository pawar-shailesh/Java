package collectionArrayList;

import java.util.HashSet;
import java.util.Objects;

public class Customerset
{ 
	int custid;
	String cuts_name;
	int prodquntity;
	public Customerset(int custid, String cuts_name, int prodquntity) {
		super();
		this.custid = custid;
		this.cuts_name = cuts_name;
		this.prodquntity = prodquntity;
	}
	@Override
	public String toString() {
		return "Customerset [custid=" + custid + ", cuts_name=" + cuts_name + ", prodquntity=" + prodquntity + "]";
	
	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(custid, cuts_name, prodquntity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customerset other = (Customerset) obj;
		return custid == other.custid && Objects.equals(cuts_name, other.cuts_name) && prodquntity == other.prodquntity;
	}
	public static void main(String[] args)
    
	{
		HashSet<Customerset> set=new HashSet<Customerset>();
		
		set.add(new Customerset(1,"Nikita",50));
        set.add(new Customerset(2,"Soham",5));
        set.add(new Customerset(3,"Nikhil",10));
        set.add(new Customerset(4,"jyoti",15));
        set.add(new Customerset(5,"rani",13));
         for(Customerset s:set)
        	 System.out.println(s);
         
        // System.out.println("null value");
         
         
         
		
	}
}
