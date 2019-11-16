package fileclass;

import java.io.File;

public class CreatingDirectrory {

	public static void main(String[] args) {
		
		File directory=new File("F://Test");
		if(directory.mkdir()==true)
		{
			System.out.println("Directory Created");
		}
		else
		{
			System.out.println("Directory not created");
		}
		if(directory.exists()==true)
		{
		System.out.println("Directory exists");
		}
		else 
		{
			System.out.println("Directory does not exists");
		}
		/*if(directory.delete()==true)
		{
			System.out.println("directory deleted");
		}
		else
		{
			System.out.println("Directory not deleted");
		}*/

	}

}
