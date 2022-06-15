package hr.atos.praksa.lejlazepcan.zadatak15;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserController extends User{

	
	public void getUser() {
		
		Scanner input = new Scanner(System.in);

		Connection connection = null;
		Statement statement = null;
		ResultSet result = null; 
		String inputEmail;
		String inputLozinka;
		String lozinkaAdmin = "admin123";
		String lozinkaSuperuser = "superuser123";
		String lozinkaUser = "user123";
		


		
		System.out.println("E-mail:");
		inputEmail = input.nextLine();
		System.out.println("Lozinka:");
		inputLozinka = input.nextLine();
		User getUser = new User();
		
		try {
			connection = DatabaseConnection.connectToDatabase();
			statement = connection.createStatement();
			String sql = "SELECT Email, Lozinka FROM Users WHERE Email = '"+ inputEmail+"' AND Lozinka = '"+ inputLozinka + "';" ;
			result = statement.executeQuery(sql);
			
			if(result == null) {
				System.out.println("Nema usera u bazi!");
			}
			else {
				
				while(result.next()) {
					
					
					getUser.setEmail(result.getString(1));
					getUser.setLozinka(result.getString(2));
							
				}
			}
			
				DatabaseConnection.connectionClose();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		if(getUser.getLozinka().equals(lozinkaAdmin)) {
			System.out.println("1. Kreiranje zaposlenika i zadataka");
			System.out.println("2. Izlistavanje zaposlenika i zadataka");
			System.out.println("3. Izmjena zaposlenika i zadataka");
			System.out.println("4. Brisanje zaposlenika i zadataka");
			System.out.println("5. Izlaz");
            
		}
		else if(getUser.getLozinka().equals(lozinkaSuperuser)) {
			System.out.println("1. Kreiranje zaposlenika i zadataka");
			System.out.println("2. Izlistavanje zaposlenika i zadataka");
			System.out.println("5. Izlaz");
		}
		else if(getUser.getLozinka().equals(lozinkaUser)){
			System.out.println("2. Izlistavanje zaposlenika i zadataka");
 			System.out.println("5. Izlaz");
		}
			
		
	}
		
}
