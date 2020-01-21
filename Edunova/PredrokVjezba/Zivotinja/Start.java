package VjezbaZaPredrok.Zivotinja;

public class Start {

	public static void main(String[] args) {
		Ptica ptica=new Ptica();
		Lastavica lastavica=new Lastavica();
		lastavica.setIme("Ja sam lastavicaaaa Miro");
		ptica.setIme("Ja sa ticurina smrdljivaaa Kruno");
		System.out.println(lastavica.getIme());
		lastavica.glasajSe();
		System.out.println(ptica.getIme());
		ptica.glasajSe();
		
	}

}
