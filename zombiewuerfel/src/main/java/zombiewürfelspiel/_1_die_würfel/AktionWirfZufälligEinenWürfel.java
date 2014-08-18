package zombiewürfelspiel._1_die_würfel;

import zombiewürfelspiel._0_technische_hilfsmittel.Zufall;
import static zombiewürfelspiel._1_die_würfel.Würfelseite.*;

public class AktionWirfZufälligEinenWürfel {
	private Zufall derZufall;
	private Würfel derWürfel;
	private Würfelseite dieSeiteDieNachDemWurfObenLiegt;

	public static AktionWirfZufälligEinenWürfel neueAktionWirfZufälligEinenWürfel(Zufall derZufall, Würfel derWürfel) {
		return new AktionWirfZufälligEinenWürfel(derWürfel, derZufall);
	}
	private AktionWirfZufälligEinenWürfel(Würfel derWürfel, Zufall derZufall) {
		this.derWürfel = derWürfel;
		this.derZufall = derZufall;
		this.dieSeiteDieNachDemWurfObenLiegt = UNBEKANNTE_WÜRFELSEITE;
	}
	
	public void ausführen() {
		dieSeiteDieNachDemWurfObenLiegt = derWürfel.dieSechsSeiten.wähleZufälligEineSeiteAus(derZufall);
	}
	
	public Würfelsymbol liefereDasGewürfelteSymbol() {
		return dieSeiteDieNachDemWurfObenLiegt.dasSymbol;
	}
}
