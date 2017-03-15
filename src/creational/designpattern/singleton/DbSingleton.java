package creational.designpattern.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DbSingleton {
	
	//private static DbSingleton instance = new DbSingleton(); this is called eagerly loaded
	//eagerly because it is created at the time of JVM created
	private static DbSingleton instance = null;
	private Connection conn=null;
	
	private DbSingleton(){
		
		try{
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());			
		}catch(SQLException e){
			e.printStackTrace();
		}		
	}
	//this is called lazily loaded
	public static DbSingleton getInstance(){
		if(instance == null){
			synchronized(DbSingleton.class){
				if(instance == null){
					instance = new DbSingleton();
				}
			}			
		}
		return instance;
	}
	
	public Connection getConnection(){
		if(conn==null){
			synchronized(DbSingleton.class){
				if(conn==null){
					try{
						String dbUrl ="jdbc.driver.memory:coreJava/webdb:create=true";
						conn = DriverManager.getConnection(dbUrl);						
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return conn;
	}
	
	

}
