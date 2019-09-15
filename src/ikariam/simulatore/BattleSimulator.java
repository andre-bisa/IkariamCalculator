package ikariam.simulatore;

import java.util.LinkedList;
import java.util.List;

import ikariam.campoDiBattaglia.CampoDiBattaglia;
import ikariam.esercito.Esercito;
import ikariam.truppa.TipoTruppa;
import ikariam.truppa.Truppa;

public class BattleSimulator<T extends Truppa> {
	
	private final CampoDiBattaglia campoDiBattaglia;
	private final Esercito<T> attaccante;
	private final Esercito<T> difensore;
	
	public BattleSimulator(CampoDiBattaglia campoDiBattaglia, Esercito<T> attaccante, Esercito<T> difensore) {
		this.campoDiBattaglia = campoDiBattaglia;
		this.attaccante = attaccante.clone();
		this.difensore = difensore.clone();
	}
	
	public RoundResult<T> getRoundResult() {
		EsercitoSchieratoPerRound schieratoAttaccante = getSchierato(this.attaccante);
		EsercitoSchieratoPerRound schieratoDifensore = getSchierato(this.difensore);
		
		RoundResult<T> result = null;
		
		return result;
	}
	
	private EsercitoSchieratoPerRound getSchierato(Esercito<T> esercitoDaSchierare) {
		Esercito<T> esercito = esercitoDaSchierare.clone();
		EsercitoSchieratoPerRound schierato = new EsercitoSchieratoPerRound();
		
		List<T> truppe;
		int indiceTruppe;
		
		truppe = esercito.getEsercitoByTipo(TipoTruppa.Bombardieri);
		if (truppe.size() > 0) {
			indiceTruppe = 0;
			for(int i = 0; i < this.campoDiBattaglia.numeroBombardieri; i++) {
				Tassello tassello = new Tassello();
				for (int j = truppe.get(0).getDimensione(); j <= this.campoDiBattaglia.dimensioneBombardieri; j += truppe.get(0).getDimensione()) {
					T truppa = truppe.get(indiceTruppe);
					tassello.truppe.add(truppa);
					esercito.removeTruppa(truppa);
					indiceTruppe++;
					if (truppe.size() <= indiceTruppe)
						break;
				}
				schierato.bombardieri.add(tassello);
				if (truppe.size() <= indiceTruppe)
					break;
			}
		}
		
		truppe = esercito.getEsercitoByTipo(TipoTruppa.Artiglieria);
		if (truppe.size() > 0) {
			indiceTruppe = 0;
			for(int i = 0; i < this.campoDiBattaglia.numeroArtiglieria; i++) {
				Tassello tassello = new Tassello();
				for (int j = truppe.get(0).getDimensione(); j <= this.campoDiBattaglia.dimensioneArtiglieria; j += truppe.get(0).getDimensione()) {
					T truppa = truppe.get(indiceTruppe);
					tassello.truppe.add(truppa);
					esercito.removeTruppa(truppa);
					indiceTruppe++;
					if (truppe.size() <= indiceTruppe)
						break;
				}
				schierato.artiglieria.add(tassello);
				if (truppe.size() <= indiceTruppe)
					break;
			}
		}
		
		truppe = esercito.getEsercitoByTipo(TipoTruppa.Distanza);
		if (truppe.size() > 0) {
			indiceTruppe = 0;
			for(int i = 0; i < this.campoDiBattaglia.numeroDistanza; i++) {
				Tassello tassello = new Tassello();
				for (int j = truppe.get(0).getDimensione(); j <= this.campoDiBattaglia.dimensioneDistanza; j += truppe.get(0).getDimensione()) {
					T truppa = truppe.get(indiceTruppe);
					tassello.truppe.add(truppa);
					esercito.removeTruppa(truppa);
					indiceTruppe++;
					if (truppe.size() <= indiceTruppe)
						break;
				}
				schierato.distanza.add(tassello);
				if (truppe.size() <= indiceTruppe)
					break;
			}
		}
		
		truppe = esercito.getEsercitoByTipo(TipoTruppa.PrimaLinea);
		if (truppe.size() > 0) {
			indiceTruppe = 0;
			for(int i = 0; i < this.campoDiBattaglia.numeroPrimaLinea; i++) {
				Tassello tassello = new Tassello();
				for (int j = truppe.get(0).getDimensione(); j <= this.campoDiBattaglia.dimensionePrimaLinea; j += truppe.get(0).getDimensione()) {
					T truppa = truppe.get(indiceTruppe);
					tassello.truppe.add(truppa);
					esercito.removeTruppa(truppa);
					indiceTruppe++;
					if (truppe.size() <= indiceTruppe)
						break;
				}
				schierato.primaLinea.add(tassello);
				if (truppe.size() <= indiceTruppe)
					break;
			}
		}
		
		truppe = esercito.getEsercitoByTipo(TipoTruppa.Fianco);
		if (truppe.size() > 0) {
			indiceTruppe = 0;
			for(int i = 0; i < this.campoDiBattaglia.numeroFianco; i++) {
				Tassello tassello = new Tassello();
				for (int j = truppe.get(0).getDimensione(); j <= this.campoDiBattaglia.dimensioneFianco; j += truppe.get(0).getDimensione()) {
					T truppa = truppe.get(indiceTruppe);
					tassello.truppe.add(truppa);
					esercito.removeTruppa(truppa);
					indiceTruppe++;
					if (truppe.size() <= indiceTruppe)
						break;
				}
				schierato.fianco.add(tassello);
				if (truppe.size() <= indiceTruppe)
					break;
			}
		}
		
		truppe = esercito.getEsercitoByTipo(TipoTruppa.Contraerea);
		if (truppe.size() > 0) {
			indiceTruppe = 0;
			for(int i = 0; i < this.campoDiBattaglia.numeroContraerea; i++) {
				Tassello tassello = new Tassello();
				for (int j = truppe.get(0).getDimensione(); j <= this.campoDiBattaglia.dimensioneContraerea; j += truppe.get(0).getDimensione()) {
					T truppa = truppe.get(indiceTruppe);
					tassello.truppe.add(truppa);
					esercito.removeTruppa(truppa);
					indiceTruppe++;
					if (truppe.size() <= indiceTruppe)
						break;
				}
				schierato.contraerea.add(tassello);
				if (truppe.size() <= indiceTruppe)
					break;
			}
		}
		
		return schierato;
	}

	private class EsercitoSchieratoPerRound {
		public LinkedList<Tassello> bombardieri = new LinkedList<>();
		public LinkedList<Tassello> artiglieria = new LinkedList<>();
		public LinkedList<Tassello> distanza = new LinkedList<>();
		public LinkedList<Tassello> primaLinea = new LinkedList<>();
		public LinkedList<Tassello> fianco = new LinkedList<>();
		public LinkedList<Tassello> contraerea = new LinkedList<>();
	}
	
	private class Tassello {
		public LinkedList<T> truppe = new LinkedList<>();
	}
	
}
