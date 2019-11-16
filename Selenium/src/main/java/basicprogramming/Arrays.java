package basicprogramming;

public class Arrays {

	public static void main(String[] args) {
		
		int values[]= {5,3,5,6,3,4,4,1,8,9};
		int values1[]=new int[values.length];
		
		for(int i=0;i<values.length;i++)
		{
			values1[i]=values[i];
		}
		
		for(int i=0;i<values.length;i++)
		System.out.print(values[i]);
		System.out.println();
		for(int i=0;i<values1.length;i++)
		System.out.print(+values1[i]);
		
		
		

	}

}
