package reflectionclassdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.*;

import com.sun.jdi.Field;

public class ReflectionTest 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class c = Class.forName("reflectionclassdemo.Employee");
		System.out.println(c);
		
		
		/*System.out.println("printed class and data type of yash");
		c="3".getClass();
		System.out.println(c);*/
		
		System.out.println("printed superclass name");
		System.out.println("Super class: "+c.getSuperclass());
		
		System.out.println("modifier name retrun");
		int mod=c.getModifiers();
		System.out.println("mod:"+mod);
		System.out.println("Access specifier:"+Modifier.toString(mod));
		
		
		System.out.println("interface name and there hashcode................");
		Class[] classes = c.getInterfaces();
		for (Class class1 : classes)
		{
			System.out.println(class1+" hashcode "+class1.hashCode());
		}
		
		System.out.println("field name.......................");
		java.lang.reflect.Field[] fields = c.getDeclaredFields();
		for(java.lang.reflect.Field field:fields)
		{
			System.out.println(fields+"hashcode"+field.hashCode());
		}
		
		System.out.println("Constructor name.......................");
		Constructor[] constructors =c.getConstructors();
		System.out.println(constructors.length);
		for(Constructor constructor:constructors)
		{
			System.out.println(constructor+" hashcode "+constructor.hashCode());
		}
		
		System.out.println("method name.......................");
		java.lang.reflect.Method[] methods = c.getDeclaredMethods();
		for(java.lang.reflect.Method method:methods)
		{
			System.out.println(method+" "+method.hashCode());
		}
	}

}
