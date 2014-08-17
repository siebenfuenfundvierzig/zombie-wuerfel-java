package zombiewuerfel._4_derSpielzug;

import zombiewuerfel._1_dieWürfel.Würfel;
import zombiewuerfel._2_derWürfelbecher.Würfelbecher;
import zombiewuerfel._3_derSpieler.Hand;

public class AktionZieheFehlendeWürfelNach {

	private Hand dieHand;
	private Würfelbecher derWürfelbecher;

	public AktionZieheFehlendeWürfelNach(Hand dieHand,
			Würfelbecher derWürfelbecher) {
		this.dieHand = dieHand;
		this.derWürfelbecher = derWürfelbecher;
	}

	public static final AktionZieheFehlendeWürfelNach neueAktionZieheFehlendeWürfelMitDerHandAusDemBecher(Hand dieHand, Würfelbecher derWürfelbecher) {
		return new AktionZieheFehlendeWürfelNach(dieHand, derWürfelbecher);
	}
	
	public void ausführen() {
		while(dieHand.hatNochNichtDreiWürfel())
			zieheNochEinenWürfelNach();
	}

	private void zieheNochEinenWürfelNach() {
		Würfel derGezogeneWürfel = derWürfelbecher.holeEinenWürfelHeraus();
		dieHand.nimmDiesenWürfel(derGezogeneWürfel);
	}
}
