package VjezbaZaPredrok.Zivotinja1;

public class Macka extends Sisavac{
private String pasmina;

public String getPasmina() {
	return pasmina;
}

public void setPasmina(String pasmina) {
	this.pasmina = pasmina;
}


public Macka(int dob, int tezina, String pasmina) {
	super(dob, tezina);
	this.pasmina = pasmina;
	this.dob=dob;
	this.tezina=tezina;
	
}

public void opisivanje(Macka macka) {
System.out.println("\nTezina: "+macka.getTezina()+"\nPasmina: "+macka.getPasmina()+"\nDob "+macka.getDob());
}


}
