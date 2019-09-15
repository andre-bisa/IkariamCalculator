package ikariam.truppa.mare;

import ikariam.truppa.TipoTruppa;
import ikariam.truppa.TruppaMare;

public class Mortaio extends TruppaMare {
	private static final int PUNTIVITA = 112;
	private static final int ARMATURA = 6;
	private static final int DIMENSIONE = 4;
	private static final TipoTruppa[] TIPOTRUPPA = {TipoTruppa.Distanza};
	private static final double GENERALI = 22.4;
	private static final int PUNTIATTACCO = 69;
	private static final Integer MUNIZIONI = 5;

	public Mortaio(int bonusArmatura, int bonusAttacco) {
		super(PUNTIVITA, ARMATURA + bonusArmatura, DIMENSIONE, TIPOTRUPPA, GENERALI, PUNTIATTACCO + bonusAttacco, MUNIZIONI);
	}
}
