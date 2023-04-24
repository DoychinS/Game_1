package geroi;
public class Geroi {
	private String ime;
	private String durjavnost;
	private String pol;
	private String cvqtKosa;
	private String cvqtKoja;
	private double visochina;
	private int godini;

	public Geroi(String i, String d, String p, String k, String kj, double v, int g) {
		ime = i;
		durjavnost = d;
		pol = p;
		cvqtKosa = k;
		cvqtKoja = kj;
		visochina = v;
		godini = g;
	}
	
	public Geroi() {
		
	}
	
	public Geroi(String i) {
		ime = i;
	}
	
	void print() {
		System.out.println("Аз съм " + ime + ".");
		System.out.println("Аз съм " + durjavnost +".");
		System.out.println("Аз съм " + pol + ".");
		System.out.println("Цветът на косата ми е " + cvqtKosa + ".");
		System.out.println("Цветът на кожата ми е " + cvqtKoja + ".");
		System.out.println("Висок съм " + visochina + " метра.");
		System.out.println("Аз съм на " + godini + " години.");
	}
}