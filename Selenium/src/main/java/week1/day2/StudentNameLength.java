package week1.day2;

public class StudentNameLength {

	public static void main(String[] args) {
		String [] studentName= {"John","Mohan","Ram","Raja","Tiger"};
		int [] age= {23,24,23,23,25};
		
		for (int i=0; i<=4; i++)
		{
			System.out.println(studentName[i] + " and the length is "+ studentName[i].length() );
		}
		
		for(int ageNum : age)
			
		{
			System.out.println("The age of the student is " + ageNum);
		}
			
		
}
}

