package zombiewürfelspiel;

import static zombiewürfelspiel._2_der_würfelbecher.Würfelbecher.neuerWürfelbecher;
import static zombiewürfelspiel._4_der_spielzug.AktionSpielzug.neuerZugDesSpielersMitDemWürfelbecher;
import zombiewürfelspiel._2_der_würfelbecher.Würfelbecher;
import zombiewürfelspiel._3_der_spieler.Spieler;
import zombiewürfelspiel._4_der_spielzug.AktionSpielzug;

public class BeispielSpiel {
	public static void main(String[] args) {
		new	BeispielSpiel().ausführen();
	}
	
	private Spieler derSpieler;
	private Würfelbecher derWürfelbecher;
	
	private void ausführen() {
		derSpieler = new Spieler();
		derWürfelbecher = neuerWürfelbecher();
		
		AktionSpielzug spielerzug = neuerZugDesSpielersMitDemWürfelbecher(derSpieler, derWürfelbecher);
		spielerzug.ausführen();
		
		System.out.println(derSpieler.dieHand);
	}


}
