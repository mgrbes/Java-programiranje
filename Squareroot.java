package hr.grbes;

import javax.swing.JOptionPane;

public class Squareroot {

	public static void main(String[] args) {
		double a=Float.parseFloat(JOptionPane.showInputDialog("Unesite broj"));
		if(a<0) {
			a=Math.abs(a);
		}
		if(a==0) {
			System.out.println("Error");
		}
		System.out.println(Math.sqrt(a));
	}

}
