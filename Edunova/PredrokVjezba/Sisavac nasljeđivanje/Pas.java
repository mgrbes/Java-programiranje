package VjezbaZaPredrok.Zivotinja1;

public class Pas extends Sisavac{

	private String pasmina;

	public String getPasmina() {
		return pasmina;
	}

	public void setPasmina(String pasmina) {
		this.pasmina = pasmina;
	}

	
	public Pas(int dob, int tezina, String pasmina) {
		super(dob, tezina);
		this.pasmina = pasmina;
		this.dob=dob;
		this.tezina=tezina;
	}

	public void opisivanje(Pas pas) {
		System.out.println("\nTezina: "+pas.getTezina()+"\nPasmina: "+pas.getPasmina()+"\nDob "+pas.getDob());
		}
	
}
