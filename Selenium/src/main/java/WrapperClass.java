
public class WrapperClass {

	public static void main(String[] args) {
		
		
//--- Converting dataType to object
		
	int iValue=100;
	Integer obj=new Integer(iValue);
	System.out.println(obj);
	
//--- Converting Object to dataType
	
	System.out.println(obj.intValue());
	
//--- Converting String object to dataType
	
	String obj1="122";
	System.out.println(Integer.parseInt(obj1));
	
	
	
	
		

	}

}
