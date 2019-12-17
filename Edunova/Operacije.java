package hr.grbes;

import javax.swing.JOptionPane;

public class Operacije {

	public static void main(String[] args) {
		//unos 5 cijelih brojeva i racunanje prosjeka
		int i1=Integer.parseInt(JOptionPane.showInputDialog("Unesite 1.cijeli broj"));
		int i2=Integer.parseInt(JOptionPane.showInputDialog("Unesite 2.cijeli broj"));
		int i3=Integer.parseInt(JOptionPane.showInputDialog("Unesite 3.cijeli broj"));
		int i4=Integer.parseInt(JOptionPane.showInputDialog("Unesite 4.cijeli broj"));
		int i5=Integer.parseInt(JOptionPane.showInputDialog("Unesite 5.cijeli broj"));
		
		float rezultat=(float)(i1+i2+i3+i4+i5)/5;
		System.out.println(rezultat);
		
		//primjer s manje linija koda
		//koristenje zagrada zbog redosljeda operacija i castanje u float tip podatka
		System.out.println((float)(Integer.parseInt(JOptionPane.showInputDialog("Unesite 1.cijeli broj"))
								+Integer.parseInt(JOptionPane.showInputDialog("Unesite 2.cijeli broj"))
								+Integer.parseInt(JOptionPane.showInputDialog("Unesite 3.cijeli broj"))
								+Integer.parseInt(JOptionPane.showInputDialog("Unesite 4.cijeli broj"))
								+Integer.parseInt(JOptionPane.showInputDialog("Unesite 5.cijeli broj")))/5);
		
	}

}
