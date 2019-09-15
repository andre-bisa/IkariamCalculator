package ikariam.truppa.mare;

import ikariam.truppa.TipoTruppa;
import ikariam.truppa.TruppaMare;

public class Sottomarino extends TruppaMare {
	private static final int PUNTIVITA = 110;
	private static final int ARMATURA = 6;
	private static final int DIMENSIONE = 3;
	private static final TipoTruppa[] TIPOTRUPPA = {TipoTruppa.Artiglieria};
	private static final double GENERALI = 20.2;
	private static final int PUNTIATTACCO = 123;
	private static final Integer MUNIZIONI = 4;

	public Sottomarino(int bonusArmatura, int bonusAttacco) {
		super(PUNTIVITA, ARMATURA + bonusArmatura, DIMENSIONE, TIPOTRUPPA, GENERALI, PUNTIATTACCO + bonusAttacco, MUNIZIONI);
	}
}
