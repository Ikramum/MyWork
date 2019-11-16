package basicprogramming;

import org.apache.poi.util.SystemOutLogger;

public class ObjectClassMethods {

	public static void main(String[] args) {
		
		
		ObjectClassMethods obj=new ObjectClassMethods();
		System.out.println(obj.equals(obj));
		System.out.println(obj.hashCode());
		System.out.println(obj.toString() );
		/*
		public final void wait()
		public final void notify()
		public final void notifyAll()
		protected object clone() throws CloneNotSupportedException
		protected void finalize()*/

	}

}
