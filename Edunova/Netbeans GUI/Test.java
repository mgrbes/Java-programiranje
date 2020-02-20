/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Test {

    private static String pocetak="Pritisnuto je: ";
    private int brojPritisaka=0;
    
    public Test() {
        JFrame prozor=new JFrame("Test Pritiska");
        JButton btnPritisni=new JButton("Pritisni gumb");
       final JLabel pritisak=new JLabel(pocetak+"   ");
       prozor.getContentPane().setLayout(new GridLayout(0, 1));
        prozor.getContentPane().add(btnPritisni);
        prozor.getContentPane().add(pritisak);
        
        prozor.pack();
        prozor.setVisible(true);
        prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btnPritisni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                brojPritisaka++;
                pritisak.setText(pocetak+brojPritisaka);
            }
        });
        
    }
    
 public static void main(String[] args) {
Test test=new Test();
 }
}
