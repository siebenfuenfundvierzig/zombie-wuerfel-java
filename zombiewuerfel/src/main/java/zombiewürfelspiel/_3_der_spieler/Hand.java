package zombiewürfelspiel._3_der_spieler;

import java.util.LinkedList;
import java.util.List;

import zombiewürfelspiel._1_die_würfel.Würfel;
import zombiewürfelspiel._1_die_würfel.Würfelsymbol;
import static zombiewürfelspiel._1_die_würfel.Würfelsymbol.*;
import static zombiewürfelspiel._1_die_würfel.Würfel.*;

public class Hand {
	private List<Würfel> dieWürfel = new LinkedList<Würfel>();
	private List<Würfelsymbol> dieGewürfeltenSymbole = new LinkedList<Würfelsymbol>();
	
	public Hand() {
		dieWürfel.add(FEHLENDER_WÜRFEL);
		dieWürfel.add(FEHLENDER_WÜRFEL);
		dieWürfel.add(FEHLENDER_WÜRFEL);
		
		dieGewürfeltenSymbole.add(UNBEKANNTES_SYMBOL);
		dieGewürfeltenSymbole.add(UNBEKANNTES_SYMBOL);
		dieGewürfeltenSymbole.add(UNBEKANNTES_SYMBOL);
	}
	
	public int anzahlDerWürfel() {
		return dieWürfel.size();
	}

	public void nimmDiesenWürfel(Würfel einWürfel) {
		verhindereDassEinVierterWürfelGenommenWird();
		fügeDiesenWürfelHinzu(einWürfel);
	}
	private void verhindereDassEinVierterWürfelGenommenWird() {
		if (esSindDreiWürfelAufDerHand())
			throw new EsDürfenNurDreiWürfelAufDerHandSein();
	}
	private boolean esSindDreiWürfelAufDerHand() {
		return anzahlDerWürfel() == 3;
	}

	private void fügeDiesenWürfelHinzu(Würfel einWürfel) {
		dieWürfel.add(einWürfel);
	}

	@Override
	public String toString() {
		return anzahlDerWürfel() + " Würfel auf der Hand";
	}

	public boolean hatNochNichtDreiWürfel() {
		return dieWürfel.size() < 3;
	}

	public void würfle() {
	}
}
