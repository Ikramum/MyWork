package basicprogramming;

public class ReverseString {

	public static void main(String[] args) {
		
		String value="Mohammed Ikramuddin";

//------Reversing a String using String Builder------------------
		
		
		/*StringBuilder value1=new StringBuilder(value);
		
//		StringBuilder value1=new StringBuilder();
//		value1.append(value);
		
		value1.reverse();
		
//		value1.delete(0, 1);
//		value1.insert(0, "n");
		
		System.out.println(value1);*/
		
		
//-------Reversing a string using toCharArray()---------------
		
		char[] charValue = value.toCharArray();
		
		for(int i=charValue.length-1;i>=0;i--)
			
			System.out.print(charValue[i]);

	}

}
