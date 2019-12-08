package hr.grbes;

import javax.swing.JOptionPane;

public class IzbornikFunkcija {

	public static void main(String[] args) {
		System.out.println("\t\tDobrodošli\nOdaberite nesto od sljedeceg:\n\t1.Mnozenje\n\t2.Dijeljenje\n\t3.Korijenovanje\n\t4.Apsolutna vrijednost broja");
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
		if (a==1) {
			float b=Float.parseFloat(JOptionPane.showInputDialog("Unesite broj za mnozenje"));
			float c=Float.parseFloat(JOptionPane.showInputDialog("Unesite broj za mnozenje"));
		}

	}

}
