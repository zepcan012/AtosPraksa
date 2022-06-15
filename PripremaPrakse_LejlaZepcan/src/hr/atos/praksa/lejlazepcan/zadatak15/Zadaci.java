package hr.atos.praksa.lejlazepcan.zadatak15;

import java.util.ArrayList;
import java.util.List;

public class Zadaci {

	 List<Zadaci> listaZadataka = new ArrayList<Zadaci>();
	 private int idZadatka;
	 private String naziv;
	 private String opis; 
	 private String tip; 
	 private String TrenutniStatus;
	 private int kompleksnost;
	 private String potrosenoVrijeme;
	 private String pocetniDatum; 
	 private String zavrsniDatum;
	 private int idZaposlenika;
	 
	public List<Zadaci> getListaZadataka() {
		return listaZadataka;
	}
	public void setListaZadataka(List<Zadaci> listaZadataka) {
		this.listaZadataka = listaZadataka;
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
	public int getIdZaposlenika() {
		return idZaposlenika;
	}
	public void setIdZaposlenika(int idZaposlenika) {
		this.idZaposlenika = idZaposlenika;
	}
	@Override
	public String toString() {
		return  idZadatka +" "+ naziv +" " + opis +" "+  tip + " "+ TrenutniStatus + " "+ kompleksnost
				+ " "+ potrosenoVrijeme + " "+ pocetniDatum + " "+  zavrsniDatum + " "+ idZaposlenika + "\n";
	}
}
