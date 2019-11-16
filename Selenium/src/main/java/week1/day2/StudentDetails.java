package week1.day2;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		
		String [] studentName= {"John","Mohan","Ram","Raja","Tiger"};
		int [] age= {23,24,23,23,25};
		char[] [] grade= {{'A','B','C','D','E'},
				{'A','B','C','D','E'},
				{'A','B','C','D','E'},
				{'A','B','C','D','E'},
				{'A','B','C','D','E'}};
		
		//whose data do we need to get
		
		System.out.println("Whose data do you want to print");
		
		// input the value
		
		Scanner scr=new Scanner(System.in);
		int index = scr.nextInt();
		
		index=index-1;
//		
//		//To Print - Ram who is 23 years old scored A,B,C,D,E
		   
		System.out.println(studentName[index] + " who is " + age[index] + " years old scored " +
		                   grade[index][0] + " , " +
		                   grade[index][1] + " , " +
		                   grade[index][2] + " , " +
		                   grade[index][3] + " , " +
		                   grade[index][4]);

	}

}
