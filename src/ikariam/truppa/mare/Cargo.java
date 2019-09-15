package ikariam.truppa.mare;

import ikariam.truppa.TipoTruppa;
import ikariam.truppa.TruppaMare;

public class Cargo extends TruppaMare {
	private static final int PUNTIVITA = 20;
	private static final int ARMATURA = 0;
	private static final int DIMENSIONE = 1;
	private static final TipoTruppa[] TIPOTRUPPA = {TipoTruppa.Contraerea};
	private static final double GENERALI = 6.4;
	private static final int PUNTIATTACCO = 12;
	private static final Integer MUNIZIONI = 5;

	public Cargo(int bonusArmatura, int bonusAttacco) {
		super(PUNTIVITA, ARMATURA + bonusArmatura, DIMENSIONE, TIPOTRUPPA, GENERALI, PUNTIATTACCO + bonusAttacco, MUNIZIONI);
	}
}
