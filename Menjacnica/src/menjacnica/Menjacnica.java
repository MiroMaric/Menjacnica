package menjacnica;

import java.util.LinkedList;

import valute.Valuta;

public class Menjacnica {
	
	//private String naziv;
	LinkedList<Valuta> valute = new LinkedList<Valuta>();

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
