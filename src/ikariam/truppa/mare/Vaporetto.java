package ikariam.truppa.mare;

import ikariam.truppa.TipoTruppa;
import ikariam.truppa.TruppaMare;

public class Vaporetto extends TruppaMare {

	private static final int PUNTIVITA = 576;
	private static final int ARMATURA = 16;
	private static final int DIMENSIONE = 5;
	private static final TipoTruppa[] TIPOTRUPPA = {TipoTruppa.PrimaLinea};
	private static final double GENERALI = 24;
	private static final int PUNTIATTACCO = 166;
	private static final Integer MUNIZIONI = Integer.MAX_VALUE;

	public Vaporetto(int bonusArmatura, int bonusAttacco) {
		super(PUNTIVITA, ARMATURA + bonusArmatura, DIMENSIONE, TIPOTRUPPA, GENERALI, PUNTIATTACCO + bonusAttacco, MUNIZIONI);
	}

}
