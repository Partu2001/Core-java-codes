package reflection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(101);
		q.add(102);
		q.add(103);
		q.add(104);
		q.add(105);
		System.out.println(q);
		
		q.offer(106);
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		System.out.println(q.element());
		System.out.println(q);
		System.out.println(q.peek());
	}

}
