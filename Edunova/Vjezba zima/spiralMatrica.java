package hr.grbes;

import javax.swing.JOptionPane;

public class spiralMatrica {

	public static void main(String[] args) {
		
			int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));
			//int a=6;
			//int b=4;
			
			
			int xmax = a-1;
			int ymax = b-1;
			int xmin=0;
			int ymin=0;
			
			int broj=1;
			
			int[][] matrica = new int [a][b];
			while(broj<=a*b) {
				
			for(int i=ymax;i>=xmin;) {
				matrica[xmax][i--]=broj++;
			}
			if(broj>(a*b)) {
				break;
			}
			for(int i=xmax-1;i>=xmin;) {
				matrica[i--][ymin]=broj++;
			}
			if(broj>(a*b)) {
				break;
			}
			for(int i=ymin+1;i<=ymax;) {
				matrica[xmin][i++]=broj++;
			}
			if(broj>(a*b)) {
				break;
			}
			for(int i=xmin+1;i<=xmax-1;) {
				matrica[i++][ymax]=broj++;
			}
			if(broj>(a*b)) {
				break;
			}
			ymin++;
			xmin++;
			ymax--;
			xmax--;
			
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
