package structural.designpattern.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEverydayDemo {

	public static void main(String[] args) {
		Integer[] arrayOfInts = new Integer[]{42,43,76};
		List<Integer> listOfInts = Arrays.asList(arrayOfInts);
		System.out.println(arrayOfInts);
		System.out.println(listOfInts);
		
		EmployeeClient client = new EmployeeClient();
		List<Employee> employees = client.getEmployeeList();
		System.out.println(employees);
		}
}