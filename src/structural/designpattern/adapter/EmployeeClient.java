package structural.designpattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public List<Employee> getEmployeeList(){
		
		List<Employee> employees = new ArrayList<>();
		Employee employeeFromDB = new EmployeeDB("1234", "Hailelul", "Teshome", "hailelul.teshome@gmail.com");
		employees.add(employeeFromDB);
		//this won't work
		//Employee employeeFromLdap = new EmployeeLdap("0023","Getachew", "Gessess","old.email@gmail.com");
		EmployeeLdap employeeFromLdap = new EmployeeLdap("0023","Getachew", "Gessess","old.email@gmail.com");
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));
		EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Getachew, Gessess,old.email@gmail.com");
		employees.add(new EmployeeAdapterCSV(employeeFromCSV));
		return employees;
		
	}

}
