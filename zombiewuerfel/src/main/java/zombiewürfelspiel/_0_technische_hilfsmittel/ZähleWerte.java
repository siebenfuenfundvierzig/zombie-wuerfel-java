package zombiewürfelspiel._0_technische_hilfsmittel;

public class ZähleWerte {
	
	static public <T> int zähleWieOftDieserIdentischeWertVorkommtIn(T wert, T...dieWerte) {
		int anzahlDerIdentischenWerte = 0;
		for (T einWert : dieWerte) {
			if (einWert == wert)
				anzahlDerIdentischenWerte++;
		}
		return anzahlDerIdentischenWerte;
	}
}
