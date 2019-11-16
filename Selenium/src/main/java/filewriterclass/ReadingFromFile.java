package filewriterclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {

	public static void main(String[] args) {

		FileReader reader=null;
		int i=0;

		try {

			reader=new FileReader("F://Test//NewFile1.txt");
			try {
				while((i=reader.read())!=-1) {
					System.out.print((char)i);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
