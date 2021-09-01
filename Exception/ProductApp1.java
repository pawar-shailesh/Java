package checkedUnchekedException;

public class ProductApp1 
{

	public  int  pid;
	public String  Pname;
	public double pprice;
	public String color;
	public ProductApp1(int pid, String pname, double pprice, String color) {
		super();
		this.pid = pid;
		Pname = pname;
		this.pprice = pprice;
		this.color = color;
	}
	@Override
	public String toString() {
		return "ProductApp1 [pid=" + pid + ", Pname=" + Pname + ", pprice=" + pprice + ", color=" + color + "]";
	}
	
}
