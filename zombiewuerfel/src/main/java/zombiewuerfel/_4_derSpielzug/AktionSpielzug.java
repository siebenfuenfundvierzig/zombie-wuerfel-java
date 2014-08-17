package zombiewuerfel._4_derSpielzug;


import static zombiewuerfel._4_derSpielzug.AktionSchütteleDenWürfelbecher.neueAktionSchütteleDenWürfelbecherZufällig;
import static zombiewuerfel._4_derSpielzug.AktionZieheFehlendeWürfelNach.neueAktionZieheFehlendeWürfelMitDerHandAusDemBecher;
import static zombiewuerfel._4_derSpielzug.AktionFülleWürfelbecher.*;
import zombiewuerfel._2_derWürfelbecher.Würfelbecher;
import zombiewuerfel._3_derSpieler.Spieler;

public class AktionSpielzug {
	
	private final Spieler derSpieler;
	private final Würfelbecher derWürfelbecher;
	
	private AktionFülleWürfelbecher fülleWürfelbecher;
	private AktionSchütteleDenWürfelbecher schütteleDenWürfelbecher;
	private AktionZieheFehlendeWürfelNach zieheFehlendeWürfelNach;

	public AktionSpielzug(Spieler derSpieler, Würfelbecher derWürfelbecher) {
		this.derSpieler = derSpieler;
		this.derWürfelbecher = derWürfelbecher;
	}

	public static AktionSpielzug neuerZugDesSpielersMitDemWürfelbecher(Spieler derSpieler, Würfelbecher derWürfelbecher) {
		return new AktionSpielzug(derSpieler, derWürfelbecher);
	}

	public void ausführen() {
		fülleWürfelbecher = neueAktionFülleWürfelbecher(derWürfelbecher);
		fülleWürfelbecher.ausführen();
		
		schütteleDenWürfelbecher = neueAktionSchütteleDenWürfelbecherZufällig(derWürfelbecher, derSpieler.zufall);
		schütteleDenWürfelbecher.ausführen();

		zieheFehlendeWürfelNach = neueAktionZieheFehlendeWürfelMitDerHandAusDemBecher(derSpieler.dieHand, derWürfelbecher);
		zieheFehlendeWürfelNach.ausführen();
	}

}
