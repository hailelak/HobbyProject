package structure.designpattern.facade;

import java.util.ArrayList;
import java.util.List;

public class FacadeJDBCDemo {

	public static void main(String[] args) {
		
		//facade our example
		
		JDBCFacade jdbcFacade = new JDBCFacade();
		jdbcFacade.createTable();
		System.out.println("Table Created!");
		jdbcFacade.insertIntoTable();
		System.out.println("Record Inserted!");
		
		List<Address> addresses = new ArrayList<Address>();
		
		for(Address address: addresses){
			System.out.println("Address Id is "+address.getId()+" Street Name "+address.getStreetName()+" City Name is "+address.getCity());
			
		}
				
		
	}

}
