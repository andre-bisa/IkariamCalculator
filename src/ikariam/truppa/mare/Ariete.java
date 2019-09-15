package ikariam.truppa.mare;

import ikariam.truppa.TipoTruppa;
import ikariam.truppa.TruppaMare;

public class Ariete extends TruppaMare {
	private static final int PUNTIVITA = 154;
	private static final int ARMATURA = 9;
	private static final int DIMENSIONE = 3;
	private static final TipoTruppa[] TIPOTRUPPA = {TipoTruppa.PrimaLinea, TipoTruppa.Fianco};
	private static final double GENERALI = 5;
	private static final int PUNTIATTACCO = 75;
	private static final Integer MUNIZIONI = Integer.MAX_VALUE;

	public Ariete(int bonusArmatura, int bonusAttacco) {
		super(PUNTIVITA, ARMATURA + bonusArmatura, DIMENSIONE, TIPOTRUPPA, GENERALI, PUNTIATTACCO + bonusAttacco, MUNIZIONI);
	}
}
