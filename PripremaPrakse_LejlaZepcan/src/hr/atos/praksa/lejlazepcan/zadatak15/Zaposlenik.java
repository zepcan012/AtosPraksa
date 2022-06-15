package hr.atos.praksa.lejlazepcan.zadatak15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Zaposlenik {
	
	List<Zaposlenik> listaZaposlenika = new ArrayList<Zaposlenik>();
	private int idZaposlenika;
	private String ime;
	private String prezime;
	private String radnoMjesto;
	private String oib;
	
	


	public int getIdZaposlenika() {
		return idZaposlenika;
	}


	public void setIdZaposlenika(int idZaposlenika) {
		this.idZaposlenika = idZaposlenika;
	}



	public String getIme() {
		return ime;
	}




	public void setIme(String ime) {
		this.ime = ime;
	}




	public String getPrezime() {
		return prezime;
	}




	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}




	public String getRadnoMjesto() {
		return radnoMjesto;
	}




	public void setRadnoMjesto(String radnoMjesto) {
		this.radnoMjesto = radnoMjesto;
	}




	public String getOib() {
		return oib;
	}




	public void setOib(String oib) {
		this.oib = oib;
	}




@Override
	public String toString() {
		return idZaposlenika + " " + ime + " " + prezime + " "
				+ radnoMjesto + " " + oib + " \n";
	}



}
