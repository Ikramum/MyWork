package week1.homework;

public class ArithmeticOperators {

	int numberOne=23;
	int numberTwo=56;
	
	public void addition()
	{
		
		int add=numberOne+numberTwo;
		System.out.println(add);

	}
	
	public void substract()
	{
		int sub=numberTwo-numberOne;
		
		System.out.println(sub);
	
	}

	public int multiplyNumberOneByTwo()
	{
		int mul=numberOne*numberTwo;
		
		//System.out.println(mul);
		
		return 0;
	}
	
	public int divideNumberTwoBy(int divident)
	{
		int divide=divident/numberTwo;
		
		System.out.println(divide);
		
		return divide;
		
	}
	
	
}
