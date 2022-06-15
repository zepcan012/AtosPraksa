package hr.atos.praksa.lejlazepcan.zadatak15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZaposlenikController extends Zaposlenik {

	
	
	public void getAllEmployees(){
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null; 

		
		try {
			connection = DatabaseConnection.connectToDatabase();
			statement = connection.createStatement();
			String sql = "SELECT * FROM Employee";
			result = statement.executeQuery(sql);
			
			if(result == null) {
				System.out.println("Nema zaposlenika u bazi!");
			}
			else {
				
				while(result.next()) {
					Zaposlenik getZaposlenik = new Zaposlenik();
					
					
					
					getZaposlenik.setIdZaposlenika(result.getInt(1));
					getZaposlenik.setIme(result.getString(2));
					getZaposlenik.setPrezime(result.getString(3));
					getZaposlenik.setRadnoMjesto(result.getString(4));
					getZaposlenik.setOib(result.getString(5));
					
					
					listaZaposlenika.add(getZaposlenik);
					
					
				}
			}
			
			if(listaZaposlenika == null) {
				System.out.println("Nema dodanih zaposlenika!");
			}
			else {
					System.out.println(listaZaposlenika);
					DatabaseConnection.connectionClose();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
			
		}
	
	
	
	
	public void insertEmployee(){
		Scanner input = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Zaposlenik unosZaposlenika = new Zaposlenik();
		
		
		System.out.println("Unesite id zaposlenika:");
	    unosZaposlenika.setIdZaposlenika(input.nextInt());
	    input.nextLine();
		System.out.println("Unesite ime zaposlenika:");
		unosZaposlenika.setIme(input.nextLine());
		System.out.println("Unesite prezime zaposlenika:");
		unosZaposlenika.setPrezime(input.nextLine());
		System.out.println("Unesite radno mjesto zaposlenika:");
		unosZaposlenika.setRadnoMjesto(input.nextLine());
		System.out.println("Unesite oib zaposlenika:");
		unosZaposlenika.setOib(input.nextLine());
		
		
		
		
		
		try {
			connection = DatabaseConnection.connectToDatabase();
			preparedStatement = connection.prepareStatement("INSERT INTO Employee (EmployeeId, Ime, Prezime, RadnoMjesto, Oib) VALUES("
					+ "'" + unosZaposlenika.getIdZaposlenika() + "',"+ "'" + unosZaposlenika.getIme() + "'," + "'"+ unosZaposlenika.getPrezime()
					+ "',"+ "'" + unosZaposlenika.getRadnoMjesto() +"'," + "'" +  unosZaposlenika.getOib() + "');");

			
			preparedStatement.executeUpdate();
		
			DatabaseConnection.connectionClose();
			
		} catch (SQLException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
			System.out.println("Zaposlenik je dodan u bazu!");
			
		}
	
	
	
	
	
	public void updateEmployee(){
		Scanner input = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Zaposlenik izmjenaZaposlenika = new Zaposlenik();
		
		System.out.println("Unesite ID zaposlenika kojem zelite promijeniti podatke:");
		izmjenaZaposlenika.setIdZaposlenika(input.nextInt());
		System.out.println("Unesite ime zaposlenika:");
		izmjenaZaposlenika.setIme(input.next());
		System.out.println("Unesite prezime zaposlenika:");
		izmjenaZaposlenika.setPrezime(input.next());
		System.out.println("Unesite radno mjesto zaposlenika:");
		izmjenaZaposlenika.setRadnoMjesto(input.next());
		System.out.println("Unesite oib zaposlenika:");
		izmjenaZaposlenika.setOib(input.next());
		input.close();
		
		try {
			connection = DatabaseConnection.connectToDatabase();
			
			
			preparedStatement = connection.prepareStatement("UPDATE Employee SET Ime = ?, Prezime = ?, RadnoMjesto = ?, Oib = ? WHERE EmployeeId = ?");
			
			preparedStatement.setString(1, izmjenaZaposlenika.getIme());
			preparedStatement.setString(2, izmjenaZaposlenika.getPrezime());
			preparedStatement.setString(3, izmjenaZaposlenika.getRadnoMjesto());
			preparedStatement.setString(4, izmjenaZaposlenika.getOib());
			preparedStatement.setInt(5, izmjenaZaposlenika.getIdZaposlenika());
			
			preparedStatement.executeUpdate();
			
			DatabaseConnection.connectionClose();
			System.out.println("Zaposlenik je izmijenjen!");

		}catch(SQLException ex) {
			System.out.println("Error!");
            ex.printStackTrace();
            System.exit(0);
		}
		
		
		
	}
	
	
	
	
	
	public void deleteEmployee(){
		Scanner input = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Zaposlenik brisanjeZaposlenika = new Zaposlenik();
		
		System.out.println("Unesite ID zaposlenika kojeg zelite obrisati:");
		brisanjeZaposlenika.setIdZaposlenika(input.nextInt());
		input.close();
		try {
			connection = DatabaseConnection.connectToDatabase();
			preparedStatement = connection.prepareStatement("DELETE FROM Employee  WHERE EmployeeId = ?");
			
			preparedStatement.setInt(1, brisanjeZaposlenika.getIdZaposlenika());
			
			preparedStatement.executeUpdate();
			
			DatabaseConnection.connectionClose();
		}catch(SQLException ex) {
			System.out.println("Error!");
            ex.printStackTrace();
            System.exit(0);
		}
		
		System.out.println("Zaposlenik je izbrisan!");
		
	}
	
	
}
