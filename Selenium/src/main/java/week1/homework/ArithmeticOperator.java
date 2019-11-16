package week1.homework;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		// declaring variables
		
		int numberOne=10, numberTwo=27;
		String str1="Cric", str2="ket";
		
		//addition of two numbers
		//Subtraction of two numbers
		System.out.println("Additon of two number" +(numberOne+numberTwo));
		System.out.println("Subtraction of two number" +(numberOne-numberTwo));
		
		//Using + operator to strings it will concatenate the two strings
		
		System.out.println("Concating two seperate word " + str1+str2 );
		
		//multiplying two numbers
		
		System.out.println("multiplication of two number" +(numberOne*numberTwo));
		
		//dividing two numbers-will give quotient
		
		System.out.println("Divition of two number" +(numberTwo/numberOne));
		
		//Modulus(getting remainder)
		
		System.out.println("Remainder of two number" +(numberTwo%+numberOne));

	}

}
