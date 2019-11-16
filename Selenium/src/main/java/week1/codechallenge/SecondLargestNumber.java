package week1.codechallenge;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int secondLarNum[]= {43,23,67,12,78};
		
		int temp=0;
		
		for (int i=0;i<secondLarNum.length;i++)
		{
			for(int j=1;j<secondLarNum.length;j++)
			{
				
				temp=secondLarNum[i];
				secondLarNum[i]=secondLarNum[j];
				secondLarNum[j]=temp;
				
			}
		}
		
		System.out.println("The Second LargestNumber is " + secondLarNum[3]);
	

	}

}
