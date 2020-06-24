package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import databaseHelper.DatabaseConfig;

public class LoginDao {
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		try{  
		Connection con = DatabaseConfig.getConnection();  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from userInfo where username=? and password=?");  
		ps.setString(1,name);  
		ps.setString(2,pass);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
}
