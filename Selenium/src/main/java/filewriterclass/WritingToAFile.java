package filewriterclass;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToAFile {

	public static void main(String[] args) {

		FileWriter writeFile=null;


		try {

			writeFile=new FileWriter("F://Test//NewFile1.txt");

			writeFile.write("Writing on a file using FileWriter class");//it will write in the outputStream
			writeFile.flush(); //it pushes the written string to the file
			System.out.println("Written to the file");
		}

		catch(IOException e)
		{
			e.printStackTrace();
		}

		finally
		{
			try {
				writeFile.close();// Once the string is been pushed it clears the outputStream
			}
			catch(IOException e){
				e.printStackTrace();

			}

		}

	}
}
