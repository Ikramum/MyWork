package week1.homework;

public class largestNumber {

	public static void main(String[] args) 
	{

		// Declaring Array variables
		
		int largestNumber[]= {16,-7,3,-13,22};
		
		//Assigning array first element to a variable called firstNumber
		
		int firstNumber=largestNumber[0];
		
		//Number of iterations known hence for loop is initiated
		
		for(int i=1;i<largestNumber.length;i++)
		{
			
			if(firstNumber>largestNumber[i])
			{
				continue;
			}
			else
			{
				firstNumber=largestNumber[i];
			}
			
			System.out.println(firstNumber);
		}

	}

}
