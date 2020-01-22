package VjezbaZaPredrok.Zivotinja1;

public class Test {

	public static void main(String[] args) {
		Sisavac sisavac=new Sisavac(2,7);
		Macka macka=new Macka(5,7,"Ivana");
		Pas pas=new Pas(7,15,"Ruzica");
		macka.opisivanje(macka);
		pas.opisivanje(pas);
	}

}
