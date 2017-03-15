package structure.designpattern.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCFacade {
	
	DbSingleton instance = null;
	

	public JDBCFacade(){
		instance = DbSingleton.getInstance();
	}
	
	public DbSingleton getInstance() {
		return instance;
	}
	
	public void setInstance(DbSingleton instance) {
		this.instance = instance;
	}
	public int createTable(){		
		
		int count = 0;
		try{
			
		
		Connection conn = instance.getConnection();
		
		Statement sta = conn.createStatement();
		
		count = sta.executeUpdate("CREATE TABLE Address (ID INT NOT NULL,StreetName VARCHAR(20) NOT NULL, City VARCHAR(20) NOT NULL, PRIMARY KEY ( id ))"); 
		sta.close();
		conn.close();
		}catch( Exception e){
			e.printStackTrace();
		}
		return count;
	}
	
	public int insertIntoTable(){
		
		int count = 0;
		try{
			
		
		Connection conn = instance.getConnection();
		
		Statement sta = conn.createStatement();		
		count = sta.executeUpdate("UPDATE INTO Address (ID, StreetName, City) VALUES(2, '1236 my street', 'Gumma')");
		sta.close();
		conn.close();
		}catch( Exception e){
			e.printStackTrace();
		}
		return count;
		
	}
	
	public List<Address> getAddresses(){
		List<Address> addresses = new ArrayList<>();
		try{
			Connection conn = instance.getConnection();
			
			Statement sta = conn.createStatement();
			
			ResultSet rs = sta.executeQuery("SELECT * FROM Address");
			
			while(rs.next()){
				System.out.println(rs.getString(1)+ ""+ rs.getString(2)+ ""+rs.getString(3));
				Address address = new Address();
				address.setId(rs.getString(1));
				address.setStreetName(rs.getString(2));
				address.setCity(rs.getString(3));
				addresses.add(address);				
			}			
			
			sta.close();
			rs.close();
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return addresses;
		
				
	}

}
