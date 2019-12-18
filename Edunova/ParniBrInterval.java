package hr.grbes;

import javax.swing.JOptionPane;

public class ParniBrInterval {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
		int min=0;
		int max=0;
		if(a>b) {
			min=b;
			max=a;
		}
		if(b>a){
			min=a;
			max=b;
		}
		int suma=0;
		System.out.println("max je="+max);
		System.out.println("min je="+min);
		for(int i=min;i<=max;i++) {
			if(i%2==0) {
				
				suma+=i;
				
			}
		}
		System.out.println(suma);

	}

}
