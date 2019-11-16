package week2.codechallenge;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		int n,p;
		
		System.out.println("Enter the Number:");
		
		Scanner scr=new Scanner(System.in);
		
		n=scr.nextInt();
		
		for(int i=2;i<n;i++)
		{
		p=0;
		for(int j=2;j<i;j++)
		{
		if(i%j==0)
		p=1;
		}
		if(p==0){
		System.out.println(i);
		}
		}
		

	}

}
