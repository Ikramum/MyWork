package fileclass;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) {

		File file=new File("F://Test//NewFile.txt");

	try {
			if(file.createNewFile()==true)
				 System.out.println("File is created");
			else

				 System.out.println("File is not created");
		 }
		catch(IOException e){
			e.printStackTrace();
		}
		if(file.exists()==true)
		{
		System.out.println("File exists");
		}
		else 
		{
			System.out.println("File does not exists");
		}
		/*if(file.delete()==true)
		{
			System.out.println("File deleted");
		}
		else
		{
			System.out.println("File not deleted");
		}*/



	}

}
