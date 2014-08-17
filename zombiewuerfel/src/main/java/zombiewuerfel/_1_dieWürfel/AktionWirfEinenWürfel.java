package zombiewuerfel._1_dieWürfel;

import zombiewuerfel._0_derZufall.Zufall;
import static zombiewuerfel._1_dieWürfel.Würfelseite.*;

public class AktionWirfEinenWürfel {
	private Zufall zufall;
	private Würfel derWürfel;
	private Würfelseite dieSeiteDieNachDemWurfObenLiegt;

	public static AktionWirfEinenWürfel neueAktionWirfEinenWürfel(Würfel derWürfel) {
		return new AktionWirfEinenWürfel(derWürfel);
	}
	private AktionWirfEinenWürfel(Würfel derWürfel) {
		this.zufall = new Zufall();
		this.derWürfel = derWürfel;
		this.dieSeiteDieNachDemWurfObenLiegt = WÜRFELSEITE_UNBEKANNT;
	}
	
	public void ausführen() {
		dieSeiteDieNachDemWurfObenLiegt = wählePerZufallEineSeiteAusDieNachObenZeigt();
	}
	
	public Würfelsymbol liefereDasGewürfelteSymbol() {
		return derWürfel.liefereDasSymbolAufDerSeite(dieSeiteDieNachDemWurfObenLiegt);
	}
	private Würfelseite wählePerZufallEineSeiteAusDieNachObenZeigt() {
		Würfelseite[] alleWürfelseiten = Würfelseite.values();
		int anzahlDerWürfelseiten = alleWürfelseiten.length;
		int zufälligerWürfelseitenIndex = zufall.eineZahlVonNullInklusiveBisObereGrenzeExklusive(anzahlDerWürfelseiten);
		return alleWürfelseiten[zufälligerWürfelseitenIndex];
	}
}
