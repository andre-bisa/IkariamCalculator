package ikariam.esercito;

import java.util.ArrayList;
import java.util.List;

import ikariam.truppa.TipoTruppa;
import ikariam.truppa.Truppa;

public abstract class Esercito<T extends Truppa> implements Cloneable {
	protected List<T> esercito = new ArrayList<>();
	
	public void addTruppa(T truppa) {
		this.esercito.add(truppa);
	}
	
	public void addTruppa(T truppa, int quantita) {
		for (int i = 0; i < quantita; i++) {
			this.addTruppa(truppa);
		}
	}
	
	public void removeTruppa(T truppa) {
		this.esercito.remove(truppa);
	}
	
	public List<T> getEsercito() {
		return new ArrayList<>(this.esercito);
	}
	
	public List<T> getEsercitoByTipo(TipoTruppa tipo) {
		ArrayList<T> result = new ArrayList<>();
		
		for (T t : this.esercito) {
			if (t.getTipoTruppa().contains(tipo))
				result.add(t);
		}
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Esercito<T> clone() {
		try {
			return (Esercito<T>) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
}
