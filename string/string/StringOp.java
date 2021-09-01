package StringsAssign;

public class StringOp 
{
	public static void main(String args[])
	{
		String Name="SUMMER WINTER";
		String s1="hello";
		String s2="world";
		String s3="hello";
		System.out.println(Name.charAt(2));
		System.out.println(Name.length());
		System.out.println(s1.concat(s2));
		System.out.println(s1.equals(s2));
		System.out.println(Name.replaceAll("M","m"));
		System.out.println(s1.equals(s3));
		System.out.println(s1.toUpperCase());
		System.out.println(Name.toLowerCase());
		System.out.println(Name.trim());
	}

}

