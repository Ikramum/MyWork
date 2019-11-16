package week1.codechallenge;

import java.util.Scanner;

public class MultiplicationOfNumbers {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the Number for Multiplication");
		
		//introduce scanner class to get input from the user 
		
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter Number 1");
		
		int enterNumber1=scr.nextInt();
		
		System.out.println("Enter Number 2");
		
		int enterNumber2=scr.nextInt();
		
		
		for(int i=1; i<=enterNumber2;i++)
		{
			int j=i*enterNumber1;
			
			System.out.println(i + " * " + enterNumber1 + " = " +j);
			
		}
	

	}

}
