package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import databaseHelper.DatabaseConfig;

public class ReadDao {
	public static boolean read(String url){  
		boolean status=false;  
		try{  
		Connection con = DatabaseConfig.getConnection();  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from data where url=? ");  
		ps.setString(1,url);  
		  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
}
