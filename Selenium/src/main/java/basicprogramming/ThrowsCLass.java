package basicprogramming;

public class ThrowsCLass {
	
	int divide(int a, int b) throws ArithmeticException
	{
	
		int t=a/b;
		return t;
	}
	

	public static void main(String[] args) {
		ThrowsCLass c1=new ThrowsCLass();
		
			try {
				c1.divide(15, 0);
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				System.out.println(" Exception has occured");
				//e.printStackTrace();
			}
	
			// TODO Auto-generated catch block
			//System.out.println(" Exception has occured");
		}

	}

