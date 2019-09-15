package ikariam.truppa;

import java.util.Arrays;
import java.util.List;

public abstract class Truppa {
	private final int puntiVitaMax;
	private final int armatura;
	private final int dimensione;
	private final TipoTruppa[] tipoTruppa;
	private final double generali;
	private final int puntiAttacco;
	private final Integer munizioni;

	private int puntiVita;
	
	public Truppa(int puntiVita, int armatura, int dimensione, TipoTruppa[] tipoTruppa, double generali,
			int puntiAttacco, Integer munizioni) {
		this.puntiVitaMax = puntiVita;
		this.armatura = armatura;
		this.dimensione = dimensione;
		this.tipoTruppa = tipoTruppa;
		this.generali = generali;
		this.puntiAttacco = puntiAttacco;
		this.munizioni = munizioni;
		
		this.puntiVita = this.puntiVitaMax;
	}
	
	public int getPuntiVitaMax() {
		return puntiVitaMax;
	}

	public int getArmatura() {
		return armatura;
	}

	public int getDimensione() {
		return dimensione;
	}

	public List<TipoTruppa> getTipoTruppa() {
		return Arrays.asList(this.tipoTruppa);
	}

	public double getGenerali() {
		return generali;
	}

	public int getPuntiAttacco() {
		return puntiAttacco;
	}

	public Integer getMunizioni() {
		return munizioni;
	}

	public int getPuntiVita() {
		return puntiVita;
	}
	
	public void setPuntiVita(int puntiVita) {
		this.puntiVita = puntiVita;
	}
	
}
