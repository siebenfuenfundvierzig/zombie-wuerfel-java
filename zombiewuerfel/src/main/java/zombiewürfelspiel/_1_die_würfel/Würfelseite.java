package zombiewürfelspiel._1_die_würfel;

import static zombiewürfelspiel._1_die_würfel.Würfelsymbol.*;

public enum Würfelseite {
	WÜRFELSEITE_MIT_SYMBOL_GEHIRN(SYMBOL_GEHIRN),
	WÜRFELSEITE_MIT_SYMBOLFUßSTAPFEN(SYMBOL_FUßSTAPFEN),
	WÜRFELSEITE_MIT_SYMBOLSCHROTFLINTE(SYMBOL_SCHROTFLINTE),
	UNBEKANNTE_WÜRFELSEITE(UNBEKANNTES_SYMBOL),
	;
	
	public final Würfelsymbol dasSymbol;

	private Würfelseite(Würfelsymbol dasSymbol) {
		this.dasSymbol = dasSymbol;
	}
}
