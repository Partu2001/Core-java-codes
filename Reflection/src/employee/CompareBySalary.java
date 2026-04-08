package employee;

import java.util.Comparator;

public class CompareBySalary implements Comparator<EmpSalaryComparator> {

	@Override
	public int compare(EmpSalaryComparator o1, EmpSalaryComparator o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getSalary(), o2.getSalary());
	}

}
