package zombiewürfelspiel._2_der_würfelbecher;

import static zombiewürfelspiel._0_technische_hilfsmittel.NMal.dreimal;
import static zombiewürfelspiel._0_technische_hilfsmittel.NMal.sechsmal;
import static zombiewürfelspiel._0_technische_hilfsmittel.NMal.viermal;
import static zombiewürfelspiel._1_die_würfel.Würfel.GELBER_WÜRFEL;
import static zombiewürfelspiel._1_die_würfel.Würfel.GRÜNER_WÜRFEL;
import static zombiewürfelspiel._1_die_würfel.Würfel.ROTER_WÜRFEL;

import java.util.LinkedList;
import java.util.List;

import zombiewürfelspiel._0_technische_hilfsmittel.Zufall;
import zombiewürfelspiel._1_die_würfel.Würfel;

public class Würfelbecher {
	private List<Würfel> dieEnthaltenenWürfel = new LinkedList<Würfel>();
	
	public static Würfelbecher neuerWürfelbecher() {
		return new Würfelbecher();
	}
	private Würfelbecher() {
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
	public void neuBefüllen() {
		entferneAlleWürfel();
		legeDieseWürfelHinein(sechsmal(GRÜNER_WÜRFEL));
		legeDieseWürfelHinein(viermal(GELBER_WÜRFEL));
		legeDieseWürfelHinein(dreimal(ROTER_WÜRFEL));
	}
	private void entferneAlleWürfel() {
		dieEnthaltenenWürfel.clear();
	}
	public void zufälligSchütteln(Zufall derZufall) {
		derZufall.durchmischeListe(dieEnthaltenenWürfel);
	}
}
