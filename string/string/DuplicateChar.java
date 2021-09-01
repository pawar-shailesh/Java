package StringsAssign;

public class DuplicateChar 
{
	public static void main(String args[])
	{
		FindDuplicateChar("aman is playing cricket");

	}
	static void FindDuplicateChar(String str)
	{
		System.out.println("Duplicates in String:"+ str);
		int count;
		for(int i=0;i<str.length();i++)
		{
			count=1;
			char c=str.charAt(i);
			if(c == ' ')
				continue;
			for(int j=i+1 ; j<str.length() ; j++)
			{
				if(c == str.charAt(j))
				{
					count++;
					str=str.substring(0, j)+ str.substring(j+ 1);
				}
			}
			if(count>1)
			{
				System.out.println(c + " found " + count + " times" );
			}
		}
	}

}
