package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetColl {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(592);
		ts.add(53);
		ts.add(976);
		ts.add(68);
		
		System.out.println(ts.first());//retrieve the first element
		/*System.out.println(ts.pollFirst());//retrieve and remove the first element
		System.out.println(ts);*/
		System.out.println(ts.last());//retrieve the last element 
		/*System.out.println(ts.pollLast());//retrieve and remove the last element
		System.out.println(ts);*/
		
		
		Iterator<Integer> itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Iterator<Integer> itr1=ts.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		Set<Integer> desc=ts.descendingSet();
		
		Iterator<Integer> itr2=desc.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		

	}

}
