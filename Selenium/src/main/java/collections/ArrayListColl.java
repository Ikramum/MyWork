package collections;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.collections4.iterators.ArrayListIterator;

public class ArrayListColl {

	public static void main(String[] args) {
	
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(null);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		System.out.println(al);
		
		for (Integer eachValue : al) {
			
			System.out.println(eachValue);
			
		}
		
		Iterator<Integer> it= al. iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(20);
		al1.add(40);
		al1.add(60);
		
		//al.addAll(al1);
		
		/*Iterator<Integer> it1= al.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}*/
		
		/*al.retainAll(al1);
		Iterator<Integer> it2= al.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}*/
		
		/*al.containsAll(al1);
		Iterator<Integer> it3= al.iterator();
		while(it3.hasNext())
		{
			System.out.println(it3.next());
		}*/
		
		System.out.println(al.containsAll(al1));
		
		al.removeAll(al1);
		Iterator<Integer> it4= al.iterator();
		while(it4.hasNext())
		{
			System.out.println(it4.next());
		}
		
		
			
		
	}

}
