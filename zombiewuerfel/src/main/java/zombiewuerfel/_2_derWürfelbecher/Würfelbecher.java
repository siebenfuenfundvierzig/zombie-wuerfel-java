package zombiewuerfel._2_derWürfelbecher;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import zombiewuerfel._0_derZufall.Zufall;
import zombiewuerfel._1_dieWürfel.Würfel;

public class Würfelbecher {
	private List<Würfel> dieEnthaltenenWürfel = new LinkedList<Würfel>();
	
	private Würfelbecher() {
		
	}
	public static Würfelbecher neuerWürfelbecher() {
		return new Würfelbecher();
	}
	public void durchmischeDieEnthaltenenWürfelPerZufall(Zufall zufall) {
		int anzahlDerEnthaltenenWürfel = dieEnthaltenenWürfel.size();
		for(int i = 0; i < anzahlDerEnthaltenenWürfel; ++i) {
			int j = zufall.eineZahlVonNullInklusiveBisObereGrenzeExklusive(anzahlDerEnthaltenenWürfel - 1);
			Collections.swap(dieEnthaltenenWürfel, i, j);
		}
	}

	public Würfel holeEinenWürfelHeraus() {
		return dieEnthaltenenWürfel.remove(0);
	}
	public void legeDieseWürfelHinein(Würfel...dieWürfel) {
		for (Würfel einWürfel : dieWürfel)
			legeEinenWürfelHinein(einWürfel);
	}
	public void legeEinenWürfelHinein(Würfel einWürfel) {
		dieEnthaltenenWürfel.add(einWürfel);
	}
	public void entferneAlleWürfel() {
		dieEnthaltenenWürfel.clear();
	}
}
