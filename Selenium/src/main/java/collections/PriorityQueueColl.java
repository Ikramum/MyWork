package collections;

import java.util.PriorityQueue;

public class PriorityQueueColl {

	public static void main(String[] args) {
		
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(20);
		pq.add(null); 
		pq.add(40);
		
		System.out.println(pq.poll());//retrieve and remove the first element in the priority Queue
		System.out.println(pq.poll());//If priority queue is empty it will return null
		System.out.println(pq);
		
		System.out.println(pq.peek());//retrieve the first element element from the queue.
		System.out.println(pq);//If priority queue is empty it will return null
		
		System.out.println(pq.remove());//retrieve and remove the first element in the priority Queue
		System.out.println(pq);//If priority queue is empty it will throw nosuchelementException
		
		System.out.println(pq.element());//If priority queue is empty it will throw nosuchelementException

	}

}
