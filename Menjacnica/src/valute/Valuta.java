package valute;

import java.util.GregorianCalendar;

public class Valuta {
	private String naziv;
	private String skracenNaziv;
	private Kurs kurs;
	
	public Valuta(String naziv,String skracenNaziv, double prodajni, double kupovni, double srednji, GregorianCalendar datum){
		if(naziv==null || skracenNaziv==null || prodajni<=0 || kupovni<=0 || srednji<=0 || datum==null)
			throw new RuntimeException("Pogresno unete vrednosti za kurs i/ili valutu");
		this.naziv = naziv;
		this.skracenNaziv = skracenNaziv;
		kurs = new Kurs(prodajni, kupovni, srednji, datum);
	}
	public Valuta(String naziv,String skracenNaziv, GregorianCalendar datum){
		if(naziv==null || skracenNaziv==null)
			throw new RuntimeException("Pogresno unete vrednosti za kurs i/ili valutu");
		this.naziv = naziv;
		this.skracenNaziv = skracenNaziv;
		this.getKurs().setDatum(datum);
	}
	public Valuta(){
		
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if(naziv==null || naziv.length()<3)
			throw new RuntimeException("Naziv valute ne moze biti null ili manji od 3 karaktera");
		this.naziv = naziv;
	}

	public String getSkracenNaziv() {
		return skracenNaziv;
	}

	public void setSkracenNaziv(String skracenNaziv) {
		if(skracenNaziv==null)
			throw new RuntimeException("Skracen naziv valute ne moze biti null");
		this.skracenNaziv = skracenNaziv;
	}
	public Kurs getKurs() {
		return kurs;
	}
	public void setKurs(Kurs kurs) {
		if(kurs==null)
			throw new RuntimeException("Kurs ne moze biti null");
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
