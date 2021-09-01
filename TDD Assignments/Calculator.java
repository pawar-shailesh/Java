package calculatestring;

public class Calculator
{
  int i,l;
	public int calculate(String string) 
	{
		if(string =="")
		{
			i= -1;
		}
		else if(string =="1")
		{
			i=1;
		}
		return i;
	}
	
	public int calculate(int h ,int k)
	{
		return h+k;
	}
	public int calculate(int h,String string,int k)
	{
		
		if(string=="\n")
		{
			l=h+k;
		}
		return l;
	}
	
	public int calculate(int h ,int k,int a)
	{
		return h+k+a;
	}
}




