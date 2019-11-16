package filewriterclass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingLineFromFile {

public static void main(String[] args) throws IOException {

String s1="file";
		
FileReader fr=null;		

BufferedReader reader = new BufferedReader(new FileReader("F://Test//NewFile1.txt"));
StringBuilder stringBuilder = new StringBuilder();
String line = null;
//String ls = System.getProperty("line.separator");
while ((line = reader.readLine()) != null) {
	stringBuilder.append(line);
	//stringBuilder.append(ls);
}
// delete the last new line separator
//stringBuilder.deleteCharAt(stringBuilder.length() - 1);
reader.close();

String content = stringBuilder.toString();

System.out.println(content);

int indexOf = content.indexOf(s1);
int lastIndexOf = content.lastIndexOf(s1);
System.out.println(indexOf);
System.out.println(lastIndexOf);

System.out.println(content.substring(indexOf));
System.out.println(content.substring(indexOf, lastIndexOf));


	}

}
