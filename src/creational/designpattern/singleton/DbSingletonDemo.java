package creational.designpattern.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class DbSingletonDemo {

	public static void main(String[] args) {
     DbSingleton instance = DbSingleton.getInstance();
     
     Connection conn = instance.getConnection();
     
     Statement stat;
     try{
    	 
    	 stat = conn.createStatement();
    	 int count = stat.executeUpdate("CREATE TABLE Address(ID INT, StreetName VARCHAR(20), City VARCHAR(20)");
    	 System.out.println("Table created!");
    	 stat.close();
    	 
     }catch(SQLException e){
    	 e.printStackTrace();
     }
     
     System.out.println(instance);
	}

}
