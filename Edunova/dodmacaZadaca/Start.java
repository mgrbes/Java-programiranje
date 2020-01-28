package dodmacaZadaca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Start {
	private List<Opcina>opcine;
	public Start() {
		opcine=new ArrayList<Opcina>();
		Scanner input=new Scanner(System.in);
		unos();
		for(Opcina o:opcine) {
			System.out.println("Zupan "+o.getZupan()+" je na vlasti u opcini "+o.getNaziv());
		}
	}

	private void unos() {
		String unos;
		Opcina opcina;
		while(true) {
			opcina=new Opcina();
			opcina.setNaziv(ucitajOpcina());
			opcina.setZupan(ucitajZupana());
			opcine.add(opcina);
			unos=JOptionPane.showInputDialog("X za kraj");
			if(unos.trim().toLowerCase().equals("x")) {
				return;
			}
			
		}
		
	}

	

	private String ucitajZupana() {
		String unos;
		while(true) {
			try {
				unos=JOptionPane.showInputDialog("Unesi naziv za zupana ");
				if(unos.trim().length()==0) {
					System.out.println("Molimo unesite naziv zupana");
				}
				return unos;
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Molimo unesite naziv zupana");
			}
			
		}
	}

	private String ucitajOpcina() {
		String unos;
		while(true) {
				unos=JOptionPane.showInputDialog("Unesi naziv za opcinu ");
				if(unos.trim().length()==0) {
					System.out.println("Molimo unesite naziv opcine");
				try {
					Integer.parseInt(unos);
					JOptionPane.showConfirmDialog(null, "Molimo unesite naziv opcine");
				}catch (Exception e) {
					// TODO: handle exception
				}
				
			}
				return unos;
		}
		
	}

	public static void main(String[] args) {
		new Start();
	}
}
