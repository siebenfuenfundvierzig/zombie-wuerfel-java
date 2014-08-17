package zombiewuerfel._4_derSpielzug;

import zombiewuerfel._1_dieWürfel.GelberWürfel;
import zombiewuerfel._1_dieWürfel.GrünerWürfel;
import zombiewuerfel._1_dieWürfel.RoterWürfel;
import zombiewuerfel._2_derWürfelbecher.Würfelbecher;

public class AktionFülleWürfelbecher {
	private Würfelbecher derWürfelbecher;

	public AktionFülleWürfelbecher(Würfelbecher derWürfelbecher) {
		this.derWürfelbecher = derWürfelbecher;
	}

	public static final AktionFülleWürfelbecher neueAktionFülleWürfelbecher(Würfelbecher derWürfelbecher) {
		return new AktionFülleWürfelbecher(derWürfelbecher);
	}

	public void ausführen() {
		derWürfelbecher.entferneAlleWürfel();
		
		legeSechsGrüneWürfelInDenBecher();
		legeVierGelbeWürfelInDenBecher();
		legeDreiRoteWürfelInDenBecher();
	}

	private void legeSechsGrüneWürfelInDenBecher() {
		derWürfelbecher.legeDieseWürfelHinein(
			new GrünerWürfel(), new GrünerWürfel(), new GrünerWürfel(),
			new GrünerWürfel(), new GrünerWürfel(), new GrünerWürfel()
		);
	}
	private void legeVierGelbeWürfelInDenBecher() {
		derWürfelbecher.legeDieseWürfelHinein(
				new GelberWürfel(), new GelberWürfel(),
				new GelberWürfel(), new GelberWürfel()
		);
	}
	private void legeDreiRoteWürfelInDenBecher() {
		derWürfelbecher.legeDieseWürfelHinein(
			new RoterWürfel(), new RoterWürfel(), new RoterWürfel()
		);
	}
}
