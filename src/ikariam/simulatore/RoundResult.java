package ikariam.simulatore;

import ikariam.esercito.Esercito;
import ikariam.truppa.Truppa;

public class RoundResult<T extends Truppa> {
	private final Esercito<T> attaccante;
	private final Esercito<T> difensore;
	
	public RoundResult(Esercito<T> attaccante, Esercito<T> difensore) {
		this.attaccante = attaccante;
		this.difensore = difensore;
	}

	public Esercito<T> getAttaccante() {
		return attaccante;
	}

	public Esercito<T> getDifensore() {
		return difensore;
	}
	
	
	
}
