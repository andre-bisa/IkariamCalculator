package main;

import ikariam.campoDiBattaglia.CampoDiBattaglia;
import ikariam.esercito.Flotta;
import ikariam.simulatore.BattleSimulator;
import ikariam.truppa.TruppaMare;
import ikariam.truppa.mare.Ariete;
import ikariam.truppa.mare.Lanciafiamme;
import ikariam.truppa.mare.Mortaio;
import ikariam.truppa.mare.Vaporetto;

public class Main {

	public static void main(String[] args) {
		CampoDiBattaglia campoDiBattaglia = new CampoDiBattaglia(2, 15, 5, 15, 7, 25, 7, 25, 6, 20, 2, 15);
		Flotta attaccante = new Flotta();
		Flotta difensore = new Flotta();
		
		difensore.addTruppa(new Lanciafiamme(4, 2), 10);
		
		difensore.addTruppa(new Ariete(0, 0), 100);
		
		attaccante.addTruppa(new Mortaio(0, 2), 5);
		attaccante.addTruppa(new Vaporetto(6, 4), 6);
		
		BattleSimulator<TruppaMare> simulatore = new BattleSimulator<>(campoDiBattaglia, attaccante, difensore);
		
		simulatore.getRoundResult();
		
	}

}
