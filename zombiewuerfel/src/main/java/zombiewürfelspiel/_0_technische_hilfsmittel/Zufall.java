package zombiewürfelspiel._0_technische_hilfsmittel;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Zufall {
	private Random sourceOfRandomness = new Random();
	
	public int liefereNächsteZahlZwischenNullInklusiveUndEndeExklusive(int endeExklusive) {
		return sourceOfRandomness.nextInt(endeExklusive);
	}
	public void durchmischeListe(List<?> liste) {
		Collections.shuffle(liste, sourceOfRandomness);
	}

}
