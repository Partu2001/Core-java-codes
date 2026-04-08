package comparable;

import java.util.Comparator;

public class CompareById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}
	

}
