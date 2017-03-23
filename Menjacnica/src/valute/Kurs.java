package valute;

import java.util.GregorianCalendar;

public class Kurs {
	private double prodajni;
	private double kupovni;
	private double srednji;
	private GregorianCalendar datum = new GregorianCalendar();
	public Kurs(double prodajni, double kupovni, double srednji,GregorianCalendar datum){
		this.prodajni = prodajni;
		this.kupovni = kupovni;
		this.srednji = srednji;
		this.datum = datum;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	
}
