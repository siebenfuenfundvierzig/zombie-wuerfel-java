package zombiewürfelspiel._1_die_würfel;

import static zombiewürfelspiel._1_die_würfel.Würfelseite.*;

import java.util.ArrayList;
import java.util.Arrays;

import zombiewürfelspiel._0_technische_hilfsmittel.Zufall;
import static zombiewürfelspiel._0_technische_hilfsmittel.NMal.*;

public enum SechsWürfelseiten {
	WÜRFELSEITEN_FÜR_GRÜNEN_WÜRFEL(
			dreimal(WÜRFELSEITE_MIT_SYMBOL_GEHIRN),
			zweimal(WÜRFELSEITE_MIT_SYMBOLFUßSTAPFEN),
			einmal(WÜRFELSEITE_MIT_SYMBOLSCHROTFLINTE)),
	WÜRFELSEITEN_FÜR_GELBEN_WÜRFEL(
			zweimal(WÜRFELSEITE_MIT_SYMBOL_GEHIRN),
			zweimal(WÜRFELSEITE_MIT_SYMBOLFUßSTAPFEN),
			zweimal(WÜRFELSEITE_MIT_SYMBOLSCHROTFLINTE)),
	WÜRFELSEITEN_FÜR_ROTEN_WÜRFEL(
			einmal(WÜRFELSEITE_MIT_SYMBOL_GEHIRN),
			zweimal(WÜRFELSEITE_MIT_SYMBOLFUßSTAPFEN),
			dreimal(WÜRFELSEITE_MIT_SYMBOLSCHROTFLINTE)),
	WÜRFELSEITEN_FÜR_FEHLENDEN_WÜRFEL(
			zweimal(UNBEKANNTE_WÜRFELSEITE),
			zweimal(UNBEKANNTE_WÜRFELSEITE),
			zweimal(UNBEKANNTE_WÜRFELSEITE));

	private SechsWürfelseiten(Würfelseite[] dieSeitenMitGehirn,
			Würfelseite[] dieSeitenMitFußstapfen,
			Würfelseite[] dieSeitenMitSchrotflinte) {
		dieSeiten = new ArrayList<Würfelseite>();
		dieSeiten.addAll(Arrays.asList(dieSeitenMitGehirn));
		dieSeiten.addAll(Arrays.asList(dieSeitenMitFußstapfen));
		dieSeiten.addAll(Arrays.asList(dieSeitenMitSchrotflinte));
	}

	private final ArrayList<Würfelseite> dieSeiten;

	public Würfelseite wähleZufälligEineSeiteAus(Zufall derZufall) {
		int zufälligerIndex = derZufall.liefereNächsteZahlZwischenNullInklusiveUndEndeExklusive(6);
		Würfelseite dieAusgewählteSeite = dieSeiten.get(zufälligerIndex);
		return dieAusgewählteSeite;
	}
}
