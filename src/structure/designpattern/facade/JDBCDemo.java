package structure.designpattern.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	//example without facade
	public static void main(String[] args){
		
		DbSingleton instance = DbSingleton.getInstance();
		
			Connection conn = instance.getConnection();
			
			Statement sta;
			try {
				sta = conn.createStatement();				
			
			int count = sta.executeUpdate("CREATE TABLE Address (ID INT NOT NULL,StreetName VARCHAR(20) NOT NULL, City VARCHAR(20) NOT NULL, PRIMARY KEY ( id ))"); 

			
			System.out.println("Table Created!");
			sta.close();
			
			sta = conn.createStatement();
			
			count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City)"+
			"values(1, '123 my street', 'Addis Ababa')");
			
			System.out.println(count + " record(s) created");
			
			
			ResultSet rs = sta.executeQuery("SELECT * FROM Address");		
			
			
			while(rs.next()){
				System.out.println(rs.getString(1)+ ""+ rs.getString(2)+ ""+rs.getString(3));
			}
			
			conn.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	

}
