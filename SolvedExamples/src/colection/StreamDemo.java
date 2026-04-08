package colection;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

	public class StreamDemo {
	    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(5, 12, 7, 20, 8, 3, 14);

	        List<Integer> result = numbers.stream()
	                .filter(n -> n % 2 == 0)
	                .map(n -> n * 10)
	                .sorted(Comparator.reverseOrder())
	                .collect(Collectors.toList());

	        System.out.println("Original List: " + numbers);

	        System.out.println("Processed List: " + result);
	    }
	}


