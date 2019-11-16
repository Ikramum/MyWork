package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetColl {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(40);
		hs.add(10);
		hs.add(null);
		hs.add(null);
		hs.add(10);
		
		
		Iterator<Integer> it=hs.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
