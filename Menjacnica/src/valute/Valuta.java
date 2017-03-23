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
	@Override
	public String toString() {
		return "Naziv valute: " + naziv + "\n Skracenica: " + skracenNaziv + "\n kurs: " + kurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skracenNaziv == null) ? 0 : skracenNaziv.hashCode());
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
		Valuta other = (Valuta) obj;
		if (kurs == null) {
			if (other.kurs != null)
				return false;
		} else if (!kurs.equals(other.kurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skracenNaziv == null) {
			if (other.skracenNaziv != null)
				return false;
		} else if (!skracenNaziv.equals(other.skracenNaziv))
			return false;
		return true;
	}
}
