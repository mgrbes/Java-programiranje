package hr.grbes;

import javax.swing.JOptionPane;

public class ProstiBrojevi {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
		int max=0,min=0;
		if(a>b){
			min=b;
			max=a;
		}
		if(a<b) {
			max=b;
			min=a;
		}
		
		for(int i=max;i>=min;i--) {
			for(int j=2;j<=max/2;j++) {
				System.out.println("min je "+min);
				if(min%j==0) {
					continue;
				}
				else {
					System.out.println(min+" je prost broj");
				}
				
				
			}
		}
		
		
		
	}

}
