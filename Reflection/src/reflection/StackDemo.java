package reflection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(101);
		s.push(102);
		s.push(103);
		s.push(104);
		s.push(105);
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		
		int result=s.search(105);
		System.out.println(result);
	}

}
