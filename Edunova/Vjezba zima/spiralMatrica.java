package hr.grbes;

import javax.swing.JOptionPane;

public class spiralMatrica {

	public static void main(String[] args) {
		
			//int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
			//int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
			
			int a=5;
			int b=4;
			
			int maxi = a-1;
			int maxj = b-1;
			int mini=0;
			int minj=0;
			
			int broj=1;
			
			int[][] matrica = new int [a][b];
			
			for(int i=maxj;i>=0;i--) {
				matrica[maxi][i]=broj++;
			}
			for(int i=maxi-1;i>=0;i--) {
				matrica[i][mini]=broj++;
			}
			for(int i=mini+1;i<=maxj;i++) {
				matrica[minj][i]=broj++;
			}
			for(;;) {
				matrica[][]==broj++;
			}
			
			
			
			
			for (int i = 0; i < a; i++)
		    {
		        for (int j = 0; j < b; j++)
		        {
		            System.out.print(matrica[i][j]+ "\t");
		        }
		         
		        System.out.println();
		    }
		}

}
