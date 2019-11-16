package week1.day2;

import java.util.Scanner;

public class PrintStudentsData {

	public static void main(String[] args) {
		String [] studentName= {"John","Mohan","Ram","Raja","Tiger"};
		int [] age= {23,24,23,23,25};
		char[] [] grade= {{'A','B','C','D','E'},
				{'A','B','C','D','E'},
				{'A','B','C','D','E'},
				{'A','B','C','D','E'},
				{'A','B','C','D','E'}};
		
		//initialize for loop
		
		for (int i=0; i<=4; i++)
		{
	
		//To Print - Ram who is 23 years old scored A,B,C,D,E
		   
		System.out.println(studentName[i] + " who is " + age[i] + " years old scored " +
		                   grade[i][0] + " , " +
		                   grade[i][1] + " , " +
		                   grade[i][2] + " , " +
		                   grade[i][3] + " , " +
		                   grade[i][4]);

	}

}

}