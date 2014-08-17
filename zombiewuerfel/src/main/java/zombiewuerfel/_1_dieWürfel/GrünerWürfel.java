package zombiewuerfel._1_dieWürfel;

import static zombiewuerfel._1_dieWürfel.Würfelsymbol.WÜRFELSYMBOL_FUßSTAPFEN;
import static zombiewuerfel._1_dieWürfel.Würfelsymbol.WÜRFELSYMBOL_GEHIRN;
import static zombiewuerfel._1_dieWürfel.Würfelsymbol.WÜRFELSYMBOL_SCHROTFLINTE;
import static zombiewuerfel._1_dieWürfel.Würfelsymbol.WÜRFELSYMBOL_UNBEKANNT;

public class GrünerWürfel implements Würfel {

	public Würfelsymbol liefereDasSymbolAufDerSeite(Würfelseite dieSeite) {		
		switch (dieSeite) {
		case WÜRFELSEITE_EINS:
			return WÜRFELSYMBOL_SCHROTFLINTE;
		case WÜRFELSEITE_ZWEI:
		case WÜRFELSEITE_DREI:
			return WÜRFELSYMBOL_FUßSTAPFEN;
		case WÜRFELSEITE_VIER:
		case WÜRFELSEITE_FÜNF:
		case WÜRFELSEITE_SECHS:
			return WÜRFELSYMBOL_GEHIRN;
		case WÜRFELSEITE_UNBEKANNT:
		default:
			return WÜRFELSYMBOL_UNBEKANNT;
		}
	}

}
