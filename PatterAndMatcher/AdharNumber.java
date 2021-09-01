package numberpattern;
import java.util.regex.*;

public class AdharNumber 
{
	private static Pattern aadhaarPattern = Pattern.compile("^[2-9]{1}[0-9]{11}$");

	 public static boolean isValidName(String name)
	 {
	  Matcher matcher = aadhaarPattern.matcher(name);
	  return matcher.find();
	 }

	 public static void main(String[] args) {


	  boolean result = isValidName("364625987893");//true
	  System.out.println("Result : " + result);

	  boolean result1 = isValidName("3646125987893");//false
	  System.out.println("Result : " + result1);

	  boolean result2 = isValidName("36425987893");//false
	  System.out.println("Result : " + result2);
	  
	  boolean result3 = isValidName("064625987893");//false
	  System.out.println("Result : " + result2);
	  
	  boolean result4 = isValidName("364602598789");//false
	  System.out.println("Result : " + result2);
	 }

	}
	


