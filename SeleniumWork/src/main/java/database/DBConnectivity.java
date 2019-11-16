package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectivity {	
		
	//JDBC driver and DB URL
		
	    static final String JDBC_Driver="com.mysql.jdbc.Driver";
		static final String DB_URL="jdbc:mysql://localhost:3306/opentabs";
		
	//Database Credentials
		
		final static String userName="dbuser";
		final static String pwd="test@123";
		
		
		public static void main(String[] args) {
		
			Connection conn=null;
			Statement stmt=null;
			
		
			
			try {
	//Register JDBC driver
				Class.forName(JDBC_Driver);
				
	//opening a connection
				try {
					conn=DriverManager.getConnection(DB_URL,userName,pwd);
					
	//Executing Query
					
					stmt=conn.createStatement();
					String sql="Select * from db.table";
					
					ResultSet rs = stmt.executeQuery(sql);
	//extracting data from result set
					
	//Extracting data from the resultset
					while(rs.next()) {
						
						
					}			
			
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}

}
