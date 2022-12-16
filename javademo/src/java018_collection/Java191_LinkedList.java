package java018_collection;

import java.util.LinkedList;

/*
 * Queue(큐)
 * 1.FIFO (Fist In First Out) : 제일 먼저 저장한 요소를 먼저 꺼내온다.
 */
public class Java191_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();
		
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		
		System.out.println(nQueue.size());
		
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.poll()); 
		
		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll());
		
		System.out.println(nQueue.size());
		

	}//end

}
