package co.edureka.collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

	public static void main(String[] args) {
	
		//Queue<Integer> queue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--) {
			queue.add(i);	// adding element in Queue
		}
		
		// This is how we added the data
		// [HEAD] 10 9 8 7 6 5 4 3 2 1 [TAIL]
		// PriorityQueue sorts the data automatically for us
		
		// Hence, the sorted version goes like this
		// [HEAD] 1 2 3 4 5 6 7 8 9 10 [TAIL]

		// peek -> returns head of queue
		// poll -> removes head of queue
		
		int head = queue.peek();
		System.out.println("Head of Queue is: "+head);		// 1
		
		queue.poll();	// remove 1
		queue.poll();	// remove 2
		
		System.out.println("Size of Queue is: "+queue.size());	// 8
		
		head = queue.peek();
		
		System.out.println("Head of Queue Now is: "+head);	// 3
		
		System.out.println("ITERATING IN QUEUE");
		
		Iterator<Integer> itr = queue.iterator();
		while(itr.hasNext()) {
			Integer element = itr.next();
			System.out.println(element);
		}
		
		ArrayDeque<String> deque = new ArrayDeque<String>();
		deque.add("AB1234");
		deque.add("XY3145");
		deque.addFirst("PQ3456");	// Head
		
		deque.poll();	// poll is poll head
		deque.pollFirst();	// poll head
		deque.pollLast();	// remove the last element
		
		String headString = deque.peek();
		System.out.println("Head of Queue is: "+headString); // PQ3456
		
		
	}

}
