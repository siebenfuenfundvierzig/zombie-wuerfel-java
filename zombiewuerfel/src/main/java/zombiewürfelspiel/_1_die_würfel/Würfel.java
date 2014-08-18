package zombiewürfelspiel._1_die_würfel;

import static zombiewürfelspiel._1_die_würfel.SechsWürfelseiten.*;
import zombiewürfelspiel._0_technische_hilfsmittel.Zufall;

public enum Würfel {
	GRÜNER_WÜRFEL(WÜRFELSEITEN_FÜR_GRÜNEN_WÜRFEL),
	GELBER_WÜRFEL(WÜRFELSEITEN_FÜR_GELBEN_WÜRFEL),
	ROTER_WÜRFEL(WÜRFELSEITEN_FÜR_ROTEN_WÜRFEL),
	FEHLENDER_WÜRFEL(WÜRFELSEITEN_FÜR_FEHLENDEN_WÜRFEL);
	
	private Würfel(SechsWürfelseiten dieSechsSeiten) {
		this.dieSechsSeiten = dieSechsSeiten;
	}
	
	public final SechsWürfelseiten dieSechsSeiten;
	
	public Würfelseite würfleZufälligEineSeite(Zufall derZufall) {
		return dieSechsSeiten.wähleZufälligEineSeiteAus(derZufall);
	}

	public boolean fehlt() {
		return FEHLENDER_WÜRFEL == this;
	}
}
