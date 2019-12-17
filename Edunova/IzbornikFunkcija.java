package hr.grbes;

import javax.swing.JOptionPane;

public class IzbornikFunkcija {

	public static void main(String[] args) {
		System.out.println("\t\tDobrodošli\nOdaberite nesto od sljedeceg:\n\t1.Mnozenje\n\t2.Dijeljenje\n\t3.Korijenovanje\n\t4.Apsolutna vrijednost broja");
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
		if (a==1) {
			float b=Float.parseFloat(JOptionPane.showInputDialog("Unesite broj za mnozenje"));
			float c=Float.parseFloat(JOptionPane.showInputDialog("Unesite broj za mnozenje"));
			System.out.println("Rezultat mnozenja broja"+b+" i "+c+"="+b*c);
		}
		if(a==2) {
			float d=Float.parseFloat(JOptionPane.showInputDialog("Unesite broj za dijeljenje"));
			float e=Float.parseFloat(JOptionPane.showInputDialog("Unesite broj za dijeljenje"));
			System.out.println("Rezultat dijeljenja "+d+" i "+e+"="+d/e);
		}
		if(a==3) {
			double f=Float.parseFloat(JOptionPane.showInputDialog("Unesite broj za korjenovanje"));
			System.out.println("Rezultat korijenovanja broja "+f+"="+Math.sqrt(f));
		}
		if(a==4) {
			double g=Float.parseFloat(JOptionPane.showInputDialog("Unesite negativan broj"));
			System.out.println("Apsolutna vrijednost broja "+g+"="+Math.abs(g));
		}

	}

}
