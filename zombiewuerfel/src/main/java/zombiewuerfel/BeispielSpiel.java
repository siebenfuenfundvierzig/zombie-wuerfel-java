package zombiewuerfel;

import static zombiewuerfel._2_derWürfelbecher.Würfelbecher.neuerWürfelbecher;
import static zombiewuerfel._4_derSpielzug.AktionSpielzug.*;
import zombiewuerfel._1_dieWürfel.GelberWürfel;
import zombiewuerfel._1_dieWürfel.GrünerWürfel;
import zombiewuerfel._1_dieWürfel.RoterWürfel;
import zombiewuerfel._2_derWürfelbecher.Würfelbecher;
import zombiewuerfel._3_derSpieler.Spieler;
import zombiewuerfel._4_derSpielzug.AktionSpielzug;

public class BeispielSpiel {
	public static void main(String[] args) {
		Spieler derSpieler = new Spieler();
		
		Würfelbecher derWürfelbecher = neuerWürfelbecher();
		derWürfelbecher.legeDieseWürfelHinein(new GelberWürfel(), new RoterWürfel(), new GrünerWürfel());

		AktionSpielzug spielerzug = neuerZugDesSpielersMitDemWürfelbecher(derSpieler, derWürfelbecher);
		spielerzug.ausführen();
		
		System.out.println(derSpieler.dieHand);
	}


}
