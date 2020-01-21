package VjezbaZaPredrok.Zarulja;

public class Zarulja {
private boolean stanje;

public Zarulja() {
	stanje=false;
}

public boolean isStanje() {
	return stanje;
}

public void setStanje(boolean stanje) {
	this.stanje = stanje;
}
public void Paljenje() {
	if(stanje==false)
		stanje=true;
	else {
		stanje=false;
	}
}
public void prekidac() {
	if (stanje==false)
		System.out.println("Ugaseno");
	else {
		System.out.println("Upaljeno");
	}
}
}
