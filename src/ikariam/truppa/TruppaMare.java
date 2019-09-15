package ikariam.truppa;

public abstract class TruppaMare extends Truppa {

	public TruppaMare(int puntiVita, int armatura, int dimensione, TipoTruppa[] tipoTruppa, double generali,
			int puntiAttacco, Integer munizioni) {
		super(puntiVita, armatura, dimensione, tipoTruppa, generali, puntiAttacco, munizioni);
	}

}
