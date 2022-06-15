package hr.atos.praksa.lejlazepcan.zadatak15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
		static String dbURL = "jdbc:sqlserver://desktop-9q8tc1b\\sqlexpress;databaseName=Zadatak15";
	 	//String dbURL = "jdbc:sqlserver://desktop-9q8tc1b\\instanceName=sqlexpress;databaseName=Zadatak15";
	    static String user = "sa";
	    static String pass = "edward";
	    
		static Connection conn;
		Statement statement = null;
		
		
		
	public static Connection connectToDatabase() {
		
	     try {
	    	 conn = DriverManager.getConnection(dbURL, user, pass);
	     }catch(SQLException ex) {
	    	 System.out.println("Error!");
		    ex.printStackTrace();    
		    System.exit(0); 
	     }
	     return conn;
	
	}
	
	
	public static void connectionClose() {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
	}
	

     

}

