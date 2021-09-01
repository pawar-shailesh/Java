package StringsAssign;

public class Member 
{
	private String firstName;
	private String lastName;
	private String emailId;
	public String getfirstName()
	{
		return firstName;
	}
	public void setfirstName(String n)
	{
		firstName=n; 
	}
	public String getlastName()
	{
		return lastName;
	}
	public void setlastName(String n)
	{
		lastName=n;
	}
	public String getemailId()
	{
		return emailId;
	}
	public void setemailId(String n)
	{
		emailId=n;
	}
	//Static String ShowMemberDetail(String firstName,String LastName,String emailId)
	//{

	//}
	public static void main(String args[])
	{
		Member cat=new Member();
		cat.setfirstName("pankaj");
		System.out.println(cat.getfirstName());
		cat.setlastName("sharma");
		System.out.println(cat.getlastName());
		cat.setemailId("pankaj.sharma@yash.com");
		System.out.println(cat.getemailId());
	}
}
