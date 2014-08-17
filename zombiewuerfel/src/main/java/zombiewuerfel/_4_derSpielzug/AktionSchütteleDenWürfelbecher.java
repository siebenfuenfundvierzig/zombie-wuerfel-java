package zombiewuerfel._4_derSpielzug;

import zombiewuerfel._0_derZufall.Zufall;
import zombiewuerfel._2_derWürfelbecher.Würfelbecher;

public class AktionSchütteleDenWürfelbecher {
	
	private Würfelbecher derWürfelbecher;
	private Zufall zufall;

	private AktionSchütteleDenWürfelbecher(Würfelbecher derWürfelbecher, Zufall zufall) {
		this.derWürfelbecher = derWürfelbecher;
		this.zufall = zufall;
	}

	public static AktionSchütteleDenWürfelbecher neueAktionSchütteleDenWürfelbecherZufällig(Würfelbecher derWürfelbecher, Zufall zufall) {
		return new AktionSchütteleDenWürfelbecher(derWürfelbecher, zufall);
	}
	
	public void ausführen() {
		derWürfelbecher.durchmischeDieEnthaltenenWürfelPerZufall(zufall);
	}
}
