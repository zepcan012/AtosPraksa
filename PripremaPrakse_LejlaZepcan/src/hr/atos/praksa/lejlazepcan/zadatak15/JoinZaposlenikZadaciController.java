package hr.atos.praksa.lejlazepcan.zadatak15;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JoinZaposlenikZadaciController extends JoinZaposlenikZadaci {
	
	
	public void getAllTables(){
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null; 
				
		try {
			connection = DatabaseConnection.connectToDatabase();
			statement = connection.createStatement();
			String sql = "SELECT * FROM Employee AS e  FULL JOIN Task t ON t.EmployeeId = e.EmployeeId;";
			result = statement.executeQuery(sql);
			
			if(result == null) {
				System.out.println("Nema podataka u bazi!");
			}
			else {
				
				while(result.next()) {
					JoinZaposlenikZadaci getAll = new JoinZaposlenikZadaci();
					
					
					
					getAll.setIdZaposlenika(result.getInt(1));
					getAll.setIme(result.getString(2));
					getAll.setPrezime(result.getString(3));
					getAll.setRadnoMjesto(result.getString(4));
					getAll.setOib(result.getString(5));
					getAll.setIdZadatka(result.getInt(6));
					getAll.setNaziv(result.getString(7));
					getAll.setOpis(result.getString(8));
					getAll.setTip(result.getString(9));
					getAll.setTrenutniStatus(result.getString(10));
					getAll.setKompleksnost(result.getInt(11));
					getAll.setPotrosenoVrijeme(result.getObject(12).toString());
					getAll.setPocetniDatum(result.getObject(13).toString());
					getAll.setZavrsniDatum(result.getObject(14).toString());
					getAll.setIdZaposlenika2(result.getInt(15));
					
					
					joinList.add(getAll);
					
					
				}
			}
			
			if(joinList == null) {
				System.out.println("Nema dodanih podataka!");
			}
			else {
					System.out.println(joinList);
					DatabaseConnection.connectionClose();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
			
		}
	
}
