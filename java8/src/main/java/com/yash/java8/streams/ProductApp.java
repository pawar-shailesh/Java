package com.yash.java8.streams;
/**
 * Using Jdk7
 * @author shailesh.pawar
 */
import java.util.ArrayList;

public class ProductApp {

	public static void main(String[] args) {
		ArrayList<Product>a=new ArrayList<>();
		a.add(new Product(1,"Mobile",4000));
		a.add(new Product(2,"TV",25000));
		a.add(new Product(3,"Remote",1000));
		a.add(new Product(4,"Laptop",45000));
		a.add(new Product(5,"TOYS",2500));
		System.out.println(a);
		ArrayList<Integer> productPrice= new ArrayList<Integer>();
		for (Product product : a) {
			if (product.getPrice()<=3000) 
			{
				productPrice.add(product.getPrice());	
			}
			
		}
		System.out.println("Filtered Product Price are :"+productPrice);

	}

}
