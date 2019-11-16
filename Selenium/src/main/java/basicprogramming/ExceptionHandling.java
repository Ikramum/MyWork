package basicprogramming;


public class ExceptionHandling {

	public static void main(String[] args) {
		
		int x=100,y=0,z=0;
		
		try
		{
		z=x/y;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);//both will give the same msg
			e.getMessage();// both will give the same msg
			e.printStackTrace();//will give the entire stack execution info based on the exception
			
		}
		
		System.out.println(z);

	}
	

}
