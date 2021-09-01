package StringsAssign;

public class Document {
	private String title;
	private String filePath;
	public String gettitle()
	{
		return title;
	}
	public void settitle(String n)
	{
		title=n;
	}
	public String getfilePath()
	{
		return filePath;
	}
	public void setfilePath(String n)
	{
		filePath=n;
	}
	/*	void ShowDocumentInfo()
		{

		System.out.println(+title);

	    }*/
	public static void main(String args[])
	{
		Document obj1=new Document();
		obj1.settitle("java basics");
		System.out.println(obj1.gettitle());
		obj1.setfilePath("C:\\Users\\ASUS\\Desktop\\sts-4.11.0.RELEASE");
		System.out.println(obj1.getfilePath());
	}
}
