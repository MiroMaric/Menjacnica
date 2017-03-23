package interfejs;

import java.util.GregorianCalendar;

import valute.Kurs;

public interface MenjacnicaInterfejs {
	public void dodajKurs(String naziv,String skracenNaziv, double prodajni, double kupovni, double srednji,
			GregorianCalendar datum);
	
	public void obrisiKurs(String naziv,String skracenNaziv, GregorianCalendar datum);
	
	public Kurs pronadjiKursValute(String naziv,String skracenNaziv, GregorianCalendar datum);
}
