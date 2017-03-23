package valute;

import java.util.GregorianCalendar;

public class Valuta {
	private String naziv;
	private String skracenNaziv;
	private Kurs kurs;
	
	public Valuta(String naziv,String skracenNaziv, double prodajni, double kupovni, double srednji, GregorianCalendar datum){
		this.naziv = naziv;
		this.skracenNaziv = skracenNaziv;
		kurs = new Kurs(prodajni, kupovni, srednji, datum);
	}
	public Valuta(String naziv,String skracenNaziv){
		this.naziv = naziv;
		this.skracenNaziv = skracenNaziv;
	}
	public Valuta(){
		
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkracenNaziv() {
		return skracenNaziv;
	}

	public void setSkracenNaziv(String skracenNaziv) {
		this.skracenNaziv = skracenNaziv;
	}
	public Kurs getKurs() {
		return kurs;
	}
	public void setKurs(Kurs kurs) {
		this.kurs = kurs;
	}
	
	

	

	
}
