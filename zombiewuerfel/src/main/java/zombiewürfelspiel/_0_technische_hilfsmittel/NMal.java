package zombiewürfelspiel._0_technische_hilfsmittel;

public class NMal {
	private NMal() {
	}
	@SuppressWarnings("unchecked")
	public static <T> T[] sechsmal(T wert) {
		return (T[]) new Object[] { wert, wert, wert, wert }; 
	}
	@SuppressWarnings("unchecked")
	public static <T> T[] viermal(T wert) {
		return (T[]) new Object[] { wert, wert, wert, wert }; 
	}
	@SuppressWarnings("unchecked")
	public static <T> T[] dreimal(T wert) {
		return (T[]) new Object[] { wert, wert, wert, wert }; 
	}
	@SuppressWarnings("unchecked")
	public static <T> T[] zweimal(T wert) {
		return (T[]) new Object[] { wert, wert }; 
	}
	@SuppressWarnings("unchecked")
	public static <T> T[] einmal(T wert) {
		return (T[]) new Object[] { wert }; 
	}
}
