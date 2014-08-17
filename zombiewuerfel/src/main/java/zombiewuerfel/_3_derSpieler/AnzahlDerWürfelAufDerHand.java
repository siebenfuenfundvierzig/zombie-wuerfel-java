package zombiewuerfel._3_derSpieler;

public enum AnzahlDerWürfelAufDerHand {
	KEINE_WÜRFEL_AUF_DER_HAND,
	EIN_WÜRFEL_AUF_DER_HAND,
	ZWEI_WÜRFEL_AUF_DER_HAND,
	DREI_WÜRFEL_AUF_DER_HAND;

	public static AnzahlDerWürfelAufDerHand liefereWertFürInt(int i) {
		return values()[i];
	}
}
