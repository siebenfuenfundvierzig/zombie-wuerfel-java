package zombiewürfelspiel._4_der_spielzug;


import zombiewürfelspiel._1_die_würfel.Würfel;
import zombiewürfelspiel._2_der_würfelbecher.Würfelbecher;
import zombiewürfelspiel._3_der_spieler.Spieler;

public class AktionSpielzug {
	
	private final Spieler derSpieler;
	private final Würfelbecher derWürfelbecher;
	
	public AktionSpielzug(Spieler derSpieler, Würfelbecher derWürfelbecher) {
		this.derSpieler = derSpieler;
		this.derWürfelbecher = derWürfelbecher;
	}

	public static AktionSpielzug neuerZugDesSpielersMitDemWürfelbecher(Spieler derSpieler, Würfelbecher derWürfelbecher) {
		return new AktionSpielzug(derSpieler, derWürfelbecher);
	}

	public void ausführen() {
		derWürfelbecher.neuBefüllen();
		
		derWürfelbecher.zufälligSchütteln(derSpieler.derZufall);
		
		zieheFehlendeWürfelNach();
		
		derSpieler.dieHand.würfle();
	}
	private void zieheFehlendeWürfelNach() {
		while(derSpieler.dieHand.hatNochNichtDreiWürfel())
			zieheNochEinenWürfelNach();
	}
	private void zieheNochEinenWürfelNach() {
		Würfel derGezogeneWürfel = derWürfelbecher.holeEinenWürfelHeraus();
		derSpieler.dieHand.nimmDiesenWürfel(derGezogeneWürfel);
	}

}
