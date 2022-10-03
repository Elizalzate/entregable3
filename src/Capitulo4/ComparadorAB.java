package Capitulo4;

import javax.swing.*;
import java.awt.event.*;

public class ComparadorAB {
    private double A, B;
    private JPanel comparadorABForm;

    private JLabel lblNumeroA, lblNumeroB;
    private JTextPane txtNumeroA, txtNumeroB;
    private JButton btnCalcular, btnLimpiar;


    public ComparadorAB() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comparar(Double.parseDouble(txtNumeroA.getText()), Double.parseDouble(txtNumeroB.getText()));
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumeroA.setText("");
                txtNumeroB.setText("");
            }
        });
    }

    public void loadForm(){
        //add the frame
        JFrame f = new JFrame("Comparador de números");
        f.setContentPane(new ComparadorAB().comparadorABForm);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        //set the location (x,y)
        f.setLocation(600, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    public void comparar ( double A, double B){
        if (A > B) {
            JOptionPane.showMessageDialog(comparadorABForm,"A es mayor que B.");
        }
        else if (A == B) {
            JOptionPane.showMessageDialog(comparadorABForm,"A es igual a B.");
        }
        else {
            JOptionPane.showMessageDialog(comparadorABForm,"A es menor que B.");
        }
    }
}
