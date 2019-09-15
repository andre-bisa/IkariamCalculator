package ikariam.truppa.mare;

import ikariam.truppa.TipoTruppa;
import ikariam.truppa.TruppaMare;

public class PortaPalloni extends TruppaMare {
	private static final int PUNTIVITA = 140;
	private static final int ARMATURA = 0;
	private static final int DIMENSIONE = 5;
	private static final TipoTruppa[] TIPOTRUPPA = {TipoTruppa.Bombardieri};
	private static final double GENERALI = 28;
	private static final int PUNTIATTACCO = 100;
	private static final Integer MUNIZIONI = 5;

	public PortaPalloni(int bonusArmatura, int bonusAttacco) {
		super(PUNTIVITA, ARMATURA + bonusArmatura, DIMENSIONE, TIPOTRUPPA, GENERALI, PUNTIATTACCO + bonusAttacco, MUNIZIONI);
	}
}
