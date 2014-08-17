package zombiewuerfel._0_derZufall;

import java.util.Random;

public class Zufall {
	private Random sourceOfRandomness = new Random();
	
	public int eineZahlVonNullInklusiveBisObereGrenzeExklusive(int obereGrenzeExklusive) {
		return sourceOfRandomness.nextInt(obereGrenzeExklusive); 
	}

}
