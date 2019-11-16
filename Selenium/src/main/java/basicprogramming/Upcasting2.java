package basicprogramming;

public class Upcasting2 extends Upcasting1 {
	
//	public void Umethod2()
	
	public void Umethod()
	{
		System.out.println("Method of upcasting2");
	}

	public static void main(String[] args) {
		
		//Upcasting
		/*
		Upcasting1 obj1=new Upcasting2();
		obj1.Umethod();*/
		
		/*Upcasting1 obj1 =new Upcasting1();
		Upcasting2 obj2 =new Upcasting2();
		
		obj1=obj2;
		obj1.Umethod();*/
		
		//Single Inheritance
		
		Upcasting2 obj1=new Upcasting2();
		obj1.Umethod1();
	//	obj1.Umethod();
		
		//Downcasting
		
		/*Upcasting1 obj1=new Upcasting2();
		obj1.Umethod1();
		
		Upcasting2 obj2=(Upcasting2) obj1;
		obj2.Umethod();*/

		
		
		
		
		

	}

}
