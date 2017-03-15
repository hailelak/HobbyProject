package structure.designpattern.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {	
	
	
//	private static final String url = "jdbc:mysql://localhost:7841/test";
//    private static final String user = "lmendozaj";
//    private static final String password = "s3cr3t"; //I won't show you my password
//    public static void main(String[] args) throws Exception {
//        Connection con = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(url, user, password);
//            //commented since doesn't exists in Java 6
//            //System.out.println(con.getSchema());
//            System.out.println(con.getCatalog());
//        } finally {
//            con.close();
//        }
//    }
	
	private final static DbSingleton instance = new DbSingleton();	
	
	  private final String url = "jdbc:mysql://localhost:3306/mydatabase";
	  private static final String user = "root";
      private static final String password = "root"; //I won't show you my password
	  
	  private static Connection conn; 
	  
	  public static DbSingleton getInstance(){
	    return instance;
	  }
	  
	  private DbSingleton(){
	    
	  }
	  
	  public Connection getConnection(){
	    checkConnect();
	    return conn;
	  }
	  
	  private void checkConnect(){
	        try {
	            if(conn == null || conn.isClosed())
	                connect();
	        } catch (SQLException ex) {
	          System.out.println(ex.getLocalizedMessage());
	        }
	    }
	  
	    private void connect() {
	        try {
	        	 
	        	try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            conn = DriverManager.getConnection(url, user, password);
	            //conn = DriverManager.getConnection(url);	           
	        } catch (SQLException ex) {
	          
	        }
	    }

}
