package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListColl {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		ll.add(10);
		ll.add(40);
		ll.add(50);
		ll.add(90);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		
		Iterator<Integer> itl=ll.iterator();
		while(itl.hasNext())

		{
			System.out.println(itl.next());
		}
	}

}
