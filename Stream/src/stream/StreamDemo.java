package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(101);
		list.add(106);
		list.add(103);
		list.add(102);
		list.add(107);
		list.add(104);
		list.add(105);
		list.add(105);
		
		list.stream().filter(x -> x%2==0).map(x -> x*2).forEach(x ->System.out.println(x));
		
		System.out.println("Ascending Order :");
		list.stream().sorted().collect(Collectors.toList()).forEach(System.out :: println);
		
		System.out.println("Descending Order");
		list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out :: println);
		
		System.out.println("Distinct");
		list.stream().distinct().forEach(System.out :: println);
		
		System.out.println("Peak");
		list.stream().filter(x -> x%2==0).peek(x -> System.out.println(x)).forEach(System.out ::println);
		
		System.out.println("Limit");
		list.stream().limit(2).forEach(x-> System.out.println(x));
		
		System.out.println("Skip");
		list.stream().skip(2).forEach(x -> System.out.println(x));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
