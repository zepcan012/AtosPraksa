package hr.atos.praksa.lejlazepcan.zadatak15;

import java.util.ArrayList;
import java.util.List;

public class JoinZaposlenikZadaci {
	
	List<JoinZaposlenikZadaci> joinList = new ArrayList<JoinZaposlenikZadaci>();


	private int idZaposlenika;
	private String ime;
	private String prezime;
	private String radnoMjesto;
	private String oib;
	private int idZadatka;
	private String naziv;
	private String opis; 
	private String tip; 
	private String TrenutniStatus;
	private int kompleksnost;
	private String potrosenoVrijeme;
	private String pocetniDatum; 
	private String zavrsniDatum;
	private int idZaposlenika2;
	public List<JoinZaposlenikZadaci> getJoinList() {
		return joinList;
	}
	public void setJoinList(List<JoinZaposlenikZadaci> joinList) {
		this.joinList = joinList;
	}
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
	public int getIdZadatka() {
		return idZadatka;
	}
	public void setIdZadatka(int idZadatka) {
		this.idZadatka = idZadatka;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getTrenutniStatus() {
		return TrenutniStatus;
	}
	public void setTrenutniStatus(String trenutniStatus) {
		TrenutniStatus = trenutniStatus;
	}
	public int getKompleksnost() {
		return kompleksnost;
	}
	public void setKompleksnost(int kompleksnost) {
		this.kompleksnost = kompleksnost;
	}
	public String getPotrosenoVrijeme() {
		return potrosenoVrijeme;
	}
	public void setPotrosenoVrijeme(String potrosenoVrijeme) {
		this.potrosenoVrijeme = potrosenoVrijeme;
	}
	public String getPocetniDatum() {
		return pocetniDatum;
	}
	public void setPocetniDatum(String pocetniDatum) {
		this.pocetniDatum = pocetniDatum;
	}
	public String getZavrsniDatum() {
		return zavrsniDatum;
	}
	public void setZavrsniDatum(String zavrsniDatum) {
		this.zavrsniDatum = zavrsniDatum;
	}
	public int getIdZaposlenika2() {
		return idZaposlenika2;
	}
	public void setIdZaposlenika2(int idZaposlenika2) {
		this.idZaposlenika2 = idZaposlenika2;
	}
	
	
	
	@Override
	public String toString() {
		return  idZaposlenika +" "+  ime+ " "+
				 prezime +" "+ radnoMjesto +" "+  oib +" "+  idZadatka +" "
				+ naziv +" "+  opis +" "+ tip +" "+  TrenutniStatus +" " +
				+ kompleksnost+" " + potrosenoVrijeme+ " "+
				 pocetniDatum +" " + zavrsniDatum +" "+  idZaposlenika2 + "\n";
	}
	
}
