package VjezbaZaPredrok.Auto;

public class Start {

	public static void main(String[] args) {
		TestAutomobila auto=new TestAutomobila();
		TestAutomobila auto1=new TestAutomobila();
		auto.setNaziv("Mazda CHR");
		auto1.setNaziv("Corsa 1.2 16v");
		auto.setPotrosnja(4);
		auto1.setPotrosnja(9);
		auto.setPrijedjenPut(1000);
		auto1.setPrijedjenPut(8000);
		UsporedbaPotrosnje.usporedi(auto, auto1);
	}

}
