package ikariam.truppa.mare;

import ikariam.truppa.TipoTruppa;
import ikariam.truppa.TruppaMare;

public class Lanciamissili extends TruppaMare {
	private static final int PUNTIVITA = 65;
	private static final int ARMATURA = 6;
	private static final int DIMENSIONE = 4;
	private static final TipoTruppa[] TIPOTRUPPA = {TipoTruppa.Artiglieria};
	private static final double GENERALI = 28;
	private static final int PUNTIATTACCO = 380;
	private static final Integer MUNIZIONI = 2;

	public Lanciamissili(int bonusArmatura, int bonusAttacco) {
		super(PUNTIVITA, ARMATURA + bonusArmatura, DIMENSIONE, TIPOTRUPPA, GENERALI, PUNTIATTACCO + bonusAttacco, MUNIZIONI);
	}
}
