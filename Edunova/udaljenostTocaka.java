package hr.grbes;

import javax.swing.JOptionPane;

public class udaljenostTocaka {
public static void main(String[] args) {
double x1=Float.parseFloat(
JOptionPane.showInputDialog("Unesite broj")
);
double x2=Float.parseFloat(
JOptionPane.showInputDialog("Unesite broj")
);
double y1=Float.parseFloat(
JOptionPane.showInputDialog("Unesite broj")
);
double y2=Float.parseFloat(
JOptionPane.showInputDialog("Unesite broj")
);
double a=x2-x1;
double b=y2-y1;
System.out.println(Math.sqrt((a*a)+(b*b)));
}
}