package week1.codechallenge;

public class sumOfArrays {

	public static void main(String[] args)
	{
		
		//declaration of array variables
		
		int[] sumOfArr= {12,56,78,90,27};
		
		int sum=0;
		
		for(int i=0;i<sumOfArr.length;i++)
		{
			sum=sum+sumOfArr[i];
		}
		
		System.out.println(sum);

	}

}
