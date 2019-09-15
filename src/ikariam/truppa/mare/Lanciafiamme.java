package ikariam.truppa.mare;

import ikariam.truppa.TipoTruppa;
import ikariam.truppa.TruppaMare;

public class Lanciafiamme extends TruppaMare {

	private static final int PUNTIVITA = 219;
	private static final int ARMATURA = 8;
	private static final int DIMENSIONE = 2;
	private static final TipoTruppa[] TIPOTRUPPA = {TipoTruppa.PrimaLinea};
	private static final double GENERALI = 6.2;
	private static final int PUNTIATTACCO = 82;
	private static final Integer MUNIZIONI = Integer.MAX_VALUE;

	public Lanciafiamme(int bonusArmatura, int bonusAttacco) {
		super(PUNTIVITA, ARMATURA + bonusArmatura, DIMENSIONE, TIPOTRUPPA, GENERALI, PUNTIATTACCO + bonusAttacco, MUNIZIONI);
	}

}
