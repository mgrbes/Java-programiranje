package VjezbaZaPredrok.Auto;

public class UsporedbaPotrosnje extends TestAutomobila {
	public static void usporedi(TestAutomobila a, TestAutomobila b) {
		float obj1, obj2;

		obj1 = a.getPrijedjenPut() / a.getPotrosnja();
		obj2 = b.getPrijedjenPut() / b.getPotrosnja();
		if (obj1 > obj2) {
			System.out.println(a.getNaziv() + " trosi vise nego " + b.getNaziv());
		}
		if (obj1 < obj2) {
			System.out.println(b.getNaziv() + " trosi vise nego " + a.getNaziv());
		}
		if (obj1 == obj2) {
			System.out.println("Jednaka je potrosnja izmedju oba auta");
		}
	}

}
