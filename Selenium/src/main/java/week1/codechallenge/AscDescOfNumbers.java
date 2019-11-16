package week1.codechallenge;

import java.util.Scanner;

public class AscDescOfNumbers {

	public static void main(String[] args) {
		
		int n, temp=0;
		
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want in an array:");
		
		n=scr.nextInt();
	
	int[] arrElements=new int[n];
	
	System.out.println("Enter the number of elements for sorting");
	
	for (int i=0; i<n;i++)
		
	{
		arrElements[i]=scr.nextInt();
	}
		//int asc[]= {23,45,12,5,67};
		
		for (int k=0; k<arrElements.length;k++)
		{
			for (int j=k+1;j<arrElements.length;j++)
			{
				if(arrElements[k]>arrElements[j])
					
				temp=arrElements[k];
				arrElements[k]=arrElements[j];
				arrElements[j]=temp;					
					
			}	 }
		
		
		/*ArrayList<Integer> list = new ArrayList();
		System.out.println(list);
		*/
		System.out.println("Print the ascending order of the numbers: " + arrElements);

	}

}
