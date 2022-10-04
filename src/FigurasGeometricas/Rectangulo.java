package FigurasGeometricas;

import Dashboard.Dashboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rectangulo {
    int base;
    int altura;
    private JPanel rectanguloForm;
    private JTextPane txtBase, txtPerimetro, txtArea, txtAltura;
    private JButton btnCalcular, btnLimpiar;

    public Rectangulo() {
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
                txtBase.setText("");
                txtArea.setText("");
                txtAltura.setText("");
                txtPerimetro.setText("");
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Rectángulo");
        f.setContentPane(new Rectangulo().rectanguloForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    void settingInfo(){
        this.base = Integer.parseInt(txtBase.getText());
        this.altura = Integer.parseInt(txtAltura.getText());
    }

    /**
     * Método que calcula y devuelve el área de un rectángulo como la
     * multiplicación de la base por la altura
     * Área de un rectángulo
     */
    void calcularArea() {
        txtArea.setText(String.valueOf(base * altura));
    }
    /**
     * Método que calcula y devuelve el perímetro de un rectángulo
     * como (2 * base) + (2 * altura)
     * Perímetro de un rectángulo
     */
    void calcularPerimetro() {
       txtPerimetro.setText(String.valueOf((2 * base) + (2 * altura)));
    }
}
