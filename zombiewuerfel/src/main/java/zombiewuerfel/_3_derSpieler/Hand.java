package zombiewuerfel._3_derSpieler;

import java.util.HashSet;
import java.util.Set;

import zombiewuerfel._1_dieWürfel.Würfel;

public class Hand {
	private Set<Würfel> dieWürfel = new HashSet<Würfel>();
	
	public AnzahlDerWürfelAufDerHand anzahlDerWürfel() {
		return AnzahlDerWürfelAufDerHand.liefereWertFürInt(dieWürfel.size());
	}

	public void nimmDiesenWürfel(Würfel derWürfel) {
		verhindereDassEinVierterWürfelGenommenWird();
		dieWürfel.add(derWürfel);
	}

	private void verhindereDassEinVierterWürfelGenommenWird() {
		int anzahlDerWürfelAufDerHand = dieWürfel.size();
		if (anzahlDerWürfelAufDerHand > 3)
			throw new EsDürfenNurDreiWürfelAufDerHandSein();
	}

	@Override
	public String toString() {
		return anzahlDerWürfel() + " Würfel auf der Hand";
	}

	public boolean hatNochNichtDreiWürfel() {
		return dieWürfel.size() < 3;
	}
}
