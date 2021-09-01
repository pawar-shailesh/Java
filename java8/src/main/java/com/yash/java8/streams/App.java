package com.yash.java8.streams;
import java.nio.file.DirectoryStream.Filter;
/**
 * Using Jdk8 lambda expression
 * @author shailesh.pawar
 */
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		ArrayList<Product>a=new ArrayList<>();
		a.add(new Product(1,"Mobile",4000));
		a.add(new Product(2,"TV",25000));
		a.add(new Product(3,"Remote",1000));
		a.add(new Product(4,"Laptop",45000));
		a.add(new Product(5,"TOYS",2500));
		System.out.println(a);
		ArrayList<Integer> productPrice=(ArrayList<Integer>) a.stream()
		.filter(p->p.price<=3000)
		.limit(1)
		.map(p->p.price)
		.collect(Collectors.toList());
		
		System.out.println(productPrice);
	
		long count=a.stream()
				.count();     //Returns the count of elements in this stream
		System.out.println(count);
	}

}
