package hr.atos.praksa.lejlazepcan.zadatak15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Scanner;

public class ZadaciController extends Zadaci{

	
	
	public void getAllTasks(){
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null; 
		
		try {
			connection = DatabaseConnection.connectToDatabase();
			statement = connection.createStatement();
			String sql = "SELECT * FROM Task";
			result = statement.executeQuery(sql);
			
			if(result == null) {
				System.out.println("Nema zadataka u bazi!");
			}
			else {
				
				while(result.next()) {
					Zadaci getZadatak = new Zadaci();
					
					getZadatak.setIdZadatka(result.getInt(1));
					getZadatak.setNaziv(result.getString(2));
					getZadatak.setOpis(result.getString(3));
					getZadatak.setTip(result.getString(4));
					getZadatak.setTrenutniStatus(result.getString(5));
					getZadatak.setKompleksnost(result.getInt(6));
					getZadatak.setPotrosenoVrijeme(result.getObject(7).toString());
					getZadatak.setPocetniDatum(result.getObject(8).toString());
					getZadatak.setZavrsniDatum(result.getObject(9).toString());
					getZadatak.setIdZaposlenika(result.getInt(10));
					
					
					listaZadataka.add(getZadatak);
					
					
				}
			}
			
			if(listaZadataka == null) {
				System.out.println("Nema dodanih zaposlenika!");
			}
			else {
					System.out.println(listaZadataka);
					DatabaseConnection.connectionClose();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
			
		}
	
	
	
	
	
	
	public void insertTask(){
		Scanner input = new Scanner(System.in);
		Connection connection = null;; 
		PreparedStatement preparedStatement = null;
		Zadaci insertZadatak = new Zadaci();
		
		
		System.out.println("Unesite id zadatka:");
		insertZadatak.setIdZadatka(input.nextInt());
		input.nextLine();
		System.out.println("Unesite naziv zadatka:");
		insertZadatak.setNaziv(input.nextLine());
		System.out.println("Unesite opis zadatka:");
		insertZadatak.setOpis(input.nextLine());
		System.out.println("Unesite tip zadatka (bug, task):");
		insertZadatak.setTip(input.nextLine());
		System.out.println("Unesite trenutni status zadatka (otvoren, zatvoren, u tijeku):");
		insertZadatak.setTrenutniStatus(input.nextLine());
		System.out.println("Unesite kompleksnost zadatka:");
		insertZadatak.setKompleksnost(input.nextInt());
		input.nextLine();
		System.out.println("Unesite potroseno vrijeme zadatka:");
		insertZadatak.setPotrosenoVrijeme(input.nextLine());
		System.out.println("Unesite pocetni datum zadatka:");
		insertZadatak.setPocetniDatum(input.nextLine());
		System.out.println("Unesite zavrsni datum zadatka:");
		insertZadatak.setZavrsniDatum(input.nextLine());
		System.out.println("Unesite ID zaposlenika kojemu je dodijeljen zadatak:");
		insertZadatak.setIdZaposlenika(input.nextInt());

		Timestamp pocetniDatum = Timestamp.valueOf(insertZadatak.getPocetniDatum());
		Timestamp zavrsniDatum = Timestamp.valueOf(insertZadatak.getZavrsniDatum());
		
		try {
			connection = DatabaseConnection.connectToDatabase();
			preparedStatement = connection.prepareStatement("INSERT INTO Task (TaskId, Naziv, Opis, Tip, TrenutniStatus, Kompleksnost, PotrosenoVrijeme, PocetniDatum, "
					+ "ZavrsniDatum, EmployeeId) VALUES(" + "'"+ insertZadatak.getIdZadatka()+"'," + "'" + insertZadatak.getNaziv() + "'," + "'"+ insertZadatak.getOpis() +"'," +  "'" +insertZadatak.getTip() + "'," 
					+ "'" + insertZadatak.getTrenutniStatus() +"'," + "'" + insertZadatak.getKompleksnost() + "',"
					+ "'"+ insertZadatak.getPotrosenoVrijeme()+ "'," + "'" +pocetniDatum/*insertZadatak.getPocetniDatum()*/+ "',"
					+ "'" + zavrsniDatum/*insertZadatak.getZavrsniDatum()*/ + "'," + "'"+ insertZadatak.getIdZaposlenika() + "' );");
		
			preparedStatement.executeUpdate();
		
			DatabaseConnection.connectionClose();
			System.out.println("Zadatak je dodan u bazu!");
			
		} catch (SQLException e) {
			System.out.println("Error!");
			e.printStackTrace();
		}
			
			
		}
	
	
	
	
	
	public void updateTask(){
		Scanner input = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Zadaci izmjenaZadatka = new Zadaci();
		
		System.out.println("Unesite id zadatka kojeg zelite promijeniti:");
		izmjenaZadatka.setIdZadatka(input.nextInt());
		input.nextLine();
		System.out.println("Unesite naziv zadatka:");
		izmjenaZadatka.setNaziv(input.nextLine());
		System.out.println("Unesite opis zadatka:");
		izmjenaZadatka.setOpis(input.nextLine());
		System.out.println("Unesite tip zadatka (bug, task):");
		izmjenaZadatka.setTip(input.nextLine());
		System.out.println("Unesite trenutni status zadatka (otvoren, zatvoren, u tijeku):");
		izmjenaZadatka.setTrenutniStatus(input.nextLine());
		System.out.println("Unesite kompleksnost zadatka:");
		izmjenaZadatka.setKompleksnost(input.nextInt());
		input.nextLine();
		System.out.println("Unesite potroseno vrijeme zadatka:");
		izmjenaZadatka.setPotrosenoVrijeme(input.nextLine());
		System.out.println("Unesite pocetni datum zadatka:");
		izmjenaZadatka.setPocetniDatum(input.nextLine());
		System.out.println("Unesite zavrsni datum zadatka:");
		izmjenaZadatka.setZavrsniDatum(input.nextLine());
		
		
		try {
			connection = DatabaseConnection.connectToDatabase();
			
			
			preparedStatement = connection.prepareStatement("UPDATE Task SET Naziv = '"+izmjenaZadatka.getNaziv()+"',"+" Opis = '"+izmjenaZadatka.getOpis()+
					"', Tip = '"+izmjenaZadatka.getTip()+"', TrenutniStatus = '"
					+izmjenaZadatka.getTrenutniStatus()+"', Kompleksnost = '"+ izmjenaZadatka.getKompleksnost() + "', PotrosenoVrijeme = '"+ izmjenaZadatka.getPotrosenoVrijeme()+ 
					"', PocetniDatum = '"+izmjenaZadatka.getPocetniDatum() + "', ZavrsniDatum = '"+ izmjenaZadatka.getZavrsniDatum() + "' WHERE TaskId = '"+izmjenaZadatka.getIdZadatka() + "'");
			
		
			
			preparedStatement.executeUpdate();
			
			DatabaseConnection.connectionClose();
		}catch(SQLException ex) {
			System.out.println("Error!");
            ex.printStackTrace();
            System.exit(0);
		}
		
		System.out.println("Zaposlenik je izmijenjen!");
		
		
	}
	
	
	
	
	public void deleteTask(){
		Scanner input = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Zadaci brisanjeZadatka = new Zadaci();
		
		System.out.println("Unesite ID zadatka kojeg zelite obrisati:");
		brisanjeZadatka.setIdZadatka(input.nextInt());
		input.close();
		try {
			connection = DatabaseConnection.connectToDatabase();
			preparedStatement = connection.prepareStatement("DELETE FROM Task  WHERE TaskId = ?");
			
			preparedStatement.setInt(1, brisanjeZadatka.getIdZadatka());
			
			preparedStatement.executeUpdate();
			
			DatabaseConnection.connectionClose();
			
			System.out.println("Zadatak je izbrisan!");
		}catch(SQLException ex) {
			System.out.println("Error!");
            ex.printStackTrace();
            System.exit(0);
		}
		
		
	}
	
	
}
