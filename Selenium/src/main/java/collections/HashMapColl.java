package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.util.SystemOutLogger;

public class HashMapColl {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		
		hm.put(10, "Mohammed");
		hm.put(20, "Ikram");
		hm.put(null, null);
		hm.put(40, null);
		
		Set<Integer> setOfKeys=hm.keySet();
		
		Iterator<Integer> itr=setOfKeys.iterator();
		while(itr.hasNext())
		{
			
			//System.out.println(itr.next());
			Integer next = itr.next();
			System.out.println(next+ " ");
			System.out.println(hm.get(next));
			
			
			Collection<String> coll=hm.values();
			ArrayList<String> al=new ArrayList<String>(coll);
			
			Iterator<String> itr1=al.iterator();
			while(itr1.hasNext());
			{
				System.out.println(itr1.next());
			}
			
			
			
		}
		
		

	}

}
