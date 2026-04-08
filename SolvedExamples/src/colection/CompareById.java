package colection;

import java.util.Comparator;

public class CompareById implements Comparator<EmployeeSorting> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(EmployeeSorting o1, EmployeeSorting o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(),o2.getId());
	}

}
