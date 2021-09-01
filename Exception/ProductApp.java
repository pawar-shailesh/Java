package checkedUnchekedException;

import java.util.InputMismatchException;
import java.util.Scanner;

class ProductApp 
{
	//create instance variable 
	private String Productname;
	private int productId;
	private double productprice;
	
	//create parameterize constractor 
	public ProductApp(String productname, int productId, double productprice) {
		super();
		this.Productname = productname;
		this.productId = productId;
		this.productprice = productprice;
		}

	public String getProductname() {
		return Productname;
	}

	public void setProductname(String productname) {
		Productname = productname;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	@Override
	public String toString() {
		return "ProductApp [Productname= " + Productname + ", productId= " + productId + ", productprice=" +  productprice
				+ "]";
	}
	  
	
 public static void main (String atgs[])
 {
	 try {
	 Scanner sc=new Scanner(System.in) ;
	 System.out.println("Enter the name of product: ");
	 String productname=sc.next();
	 
	 // Scanner sc=new Scanner(System.in) ;
	  System.out.println("Enter the id of product: ");
      int  productId=sc.nextInt();
      
      System.out.println("Enter the price of product: ");
      double   productprice=sc.nextDouble();
       
      System.out.println("product name :"+productname+     "Product id: "+ productId+     "product price:  "+ productprice);
	 }
 
	 catch(InputMismatchException e)
	 {
		System.out.println("InputMismatchException occured !");
		System.out.println(e);
	 }
}
}
 
