package deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import serialization.SerializationClass;

public class DeserializationClass {
	
	public static void main(String[] args) {
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("F://Test//shoppingcart.ser");
			ois=new ObjectInputStream(fis);
			Object readObject = ois.readObject();
			SerializationClass ref=(SerializationClass)readObject;
		}
	}

}
