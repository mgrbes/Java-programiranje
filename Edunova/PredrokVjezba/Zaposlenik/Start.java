package VjezbaZaPredrok;

public class Start {

	public static void main(String[] args) {
		Zaposlenik zaposlenik=new Zaposlenik();
		zaposlenik.setPlaca(3600);
		zaposlenik.setStarost(26);
		zaposlenik.setStaz(6);
		
		zaposlenik.izracun(zaposlenik.getStaz(),zaposlenik.getPlaca() );
	}

}
