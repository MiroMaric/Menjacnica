package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;
import valute.Kurs;
import valute.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {
	
	//private String naziv;
	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(String naziv, String skracenNaziv, double prodajni, double kupovni, double srednji,
			GregorianCalendar datum) {
		Valuta v = new Valuta();
		v.setNaziv(naziv);
		v.setSkracenNaziv(skracenNaziv);
		v.setKurs(new Kurs(prodajni, kupovni, srednji, datum));
		valute.add(v);
	}

	@Override
	public void obrisiKurs(String naziv, String skracenNaziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs pronadjiKursValute(String naziv, String skracenNaziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		if(valute==null)
			throw new RuntimeException("Lista sa valutama menjacnice ne moze biti null");
		this.valute = valute;
	}

	@Override
	public String toString() {
		return "Valute: " + valute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menjacnica other = (Menjacnica) obj;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}
}
