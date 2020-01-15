package beans;

import beans.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmpHelper {

	public static List<Employee> getEmps() {

		Employee e1 = new Employee(1, "Pepe");
		Employee e2 = new Employee(2, "David");
		Employee e3 = new Employee(3, "Miguel");
		Employee e4 = new Employee(4, "Luis");
		Employee e5 = new Employee(5, "Juan");
		
		List<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		return emps;
	}

}