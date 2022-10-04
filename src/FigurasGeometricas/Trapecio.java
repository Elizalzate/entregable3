package FigurasGeometricas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Trapecio {
    int baseMayor;
    int baseMenor;
    int altura;

    private JPanel trapecioForm;
    private JTextPane txtArea, txtAltura, txtBaseMenor, txtBaseMayor, txtPerimetro;
    private JButton btnCalcular, btnLimpiar;

    public Trapecio() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingInfo();
                calcularArea();
                calcularPerimetro();
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("");
                txtAltura.setText("");
                txtBaseMayor.setText("");
                txtBaseMenor.setText("");
                txtPerimetro.setText("");
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Trapecio");
        f.setContentPane(new Trapecio().trapecioForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    private void settingInfo(){
        this.baseMenor = Integer.parseInt(txtBaseMenor.getText());
        this.baseMayor = Integer.parseInt(txtBaseMayor.getText());
        this.altura = Integer.parseInt(txtAltura.getText());
    }

    private void calcularArea() {
        txtArea.setText(String.valueOf(((baseMayor + baseMenor) / 2.0)*altura));
    }

    private void calcularPerimetro() {
       txtPerimetro.setText(String.valueOf(baseMenor + baseMayor + 2*Math.sqrt(Math.pow((baseMayor-baseMenor)/2.0,2) + Math.pow(altura,2))));
    }
}
