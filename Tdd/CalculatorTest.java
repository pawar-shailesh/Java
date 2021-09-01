package calculatestring;

import org.junit.jupiter.api.Assertions;
import  org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest 
{

	@Test
	public void string_retrun_zero_value_shouldretrunzero() 
	{
		Calculator cal = new Calculator();
		Assertions.assertEquals(cal.calculate(""), 0);
	}

	@test
	public void String_retrun_singlevalue_shouldretrunsingalvalue()
	{
		Calculator cal = new Calculator();
		Assertions.assertEquals(cal.calculate("1"), 1);
	}
	@test
	public void String_retrun_twovalue_shouldreturnvaluesum()
	{
		Calculator cal = new Calculator();
		Assertions.assertEquals(cal.calculate(2,2), 4);
	}
	@test
	public void String_retrun_two_number_new_line()
	{
		Calculator cal = new Calculator();
		Assertions.assertEquals(cal.calculate("2 \n 2"), 4);
	}
	@test
	public void String_retrun_threevalue_shouldreturnvaluesum()
	{
		Calculator cal = new Calculator();
		Assertions.assertEquals(cal.calculate(2,2,2), 6);
	}
	
	
}

