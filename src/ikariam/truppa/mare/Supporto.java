package ikariam.truppa.mare;

import ikariam.truppa.TipoTruppa;
import ikariam.truppa.TruppaMare;

public class Supporto extends TruppaMare {
	private static final int PUNTIVITA = 140;
	private static final int ARMATURA = 0;
	private static final int DIMENSIONE = 6;
	private static final TipoTruppa[] TIPOTRUPPA = {TipoTruppa.Approvigionamento};
	private static final double GENERALI = 16;
	private static final int PUNTIATTACCO = 15;
	private static final Integer MUNIZIONI = Integer.MAX_VALUE;

	public Supporto(int bonusArmatura, int bonusAttacco) {
		super(PUNTIVITA, ARMATURA + bonusArmatura, DIMENSIONE, TIPOTRUPPA, GENERALI, PUNTIATTACCO + bonusAttacco, MUNIZIONI);
	}
}
