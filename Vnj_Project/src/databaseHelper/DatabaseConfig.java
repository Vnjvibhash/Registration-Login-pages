package databaseHelper;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConfig {
	
	static String url = "jdbc:mysql://localhost:3306/rts_project";
	static String username="rts_project";
	static String password="rts_project";
    public static Connection getConnection(){
    	 Connection con = null;
    	 try {
    		 
    		 Class.forName("com.mysql.cj.jdbc.Driver");
    		 con = DriverManager.getConnection(url,username,password);
    	 }catch(Exception e) {
    		System.out.print("Can't connect to database"); 
    		 
    	 }
    	 
    	
    	return con;
    }
}
