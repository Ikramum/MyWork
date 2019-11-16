package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SubSerialization {

	public static void main(String[] args) {
		
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		SerializationClass sc=new SerializationClass();
		sc.productName="Adidas";
		sc.productId="ad-012";
		sc.productPrice=4000;
		sc.quantity=2;
		
		try {
			fos=new FileOutputStream("F://Test//shoppingcart.ser");
			try {
				oos=new ObjectOutputStream(fos);
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				oos.writeObject(sc);
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				oos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Object is serialized");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				oos.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
