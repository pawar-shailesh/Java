package checkedUnchekedException;

import java.awt.List;
import java.util.ArrayList;

 class Product 
{
	private String  Pname;
	private double Pprice;
	private int pid;
	public Product() {}
	
	 public Product(double pprice, String pname, int pid) { //create argument Constractor
		super();
		this.Pname = pname;
		this.Pprice = pprice;
		this.pid = pid;
		
	 }	
	public String getPname() {
		return Pname;
	}
    public void setPname(String pname) {
		Pname = pname;
	}
   public double getPprice() {
		return Pprice;
	}

   public void setPprice(double pprice) {
		Pprice = pprice;
	}

    public int getPid() {
		return pid;
	}
    public void setPid(int pid) {
		this.pid = pid;
	}
    
	 
  
@Override
	public String toString() {
		return "Product [Pname=" + Pname + ", Pprice=" + Pprice + ", pid=" + pid + "]";
	}




   
   
public static void main(String args[])
    {
       Product p1=new Product(3000,"tv",1);
       Product p2=new Product(300,"Remot",2);
       Product p3=new Product(1000,"SetupBox",3);
       Product p4=new Product(20000,"Mobile",4);
       Product p5=new Product(1000,"Router",5);
       Product p6=new Product(22000,"Fridge",6);
       
       ArrayList<Product> list=new ArrayList<Product>();
       list.add(p1);
       list.add(p2);
       list.add(p3);
       list.add(p4);
       list.add(p5);
       list.add(p6);
       
      System.out.println(list); 
      
      for(Product product:list)
      {
    	  System.out.println(product);
      }
    	  
        try {
        	
        
      System.out.println("Original ArrayList : "+list);
      ArrayList<Product> subList = (ArrayList<Product>) list.subList(1, 7);//Exception in thread "main" java.lang.IndexOutOfBoundsException: toIndex = 7
      System.out.println("SubList from ArrayList: "+subList);
      } 
      
      catch(Exception e)
        {
    	  
    	  System.out.println(e);
      }
      
    }
    
}
