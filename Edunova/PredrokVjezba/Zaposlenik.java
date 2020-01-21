package VjezbaZaPredrok;

public class Zaposlenik {
	private int staz;
	private int starost;
	private float placa;

	public Zaposlenik(int staz, int starost, float placa) {
		
		this.staz = staz;
		this.starost = starost;
		this.placa = placa;
	}

	public Zaposlenik() {
		
	}

	public int getStaz() {
		return staz;
	}

	public void setStaz(int staz) {
		this.staz = staz;
	}

	public int getStarost() {
		return starost;
	}

	public void setStarost(int starost) {
		this.starost = starost;
	}

	public float getPlaca() {
		return placa;
	}

	public void setPlaca(float placa) {
		this.placa = placa;
	}

	public void izracun(int staz,float placa) {
		System.out.println(staz*12*placa);
	}
	
	
}
