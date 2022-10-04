package FigurasGeometricas;

import javax.swing.*;
import java.awt.event.*;

/**
 * Esta clase define objetos de tipo Círculo con su radio como atributo.
 * Se aplica con interfaz gráfica
 */
public class Circulo {
    int radio; // Atributo que define el radio de un círculo
    private JPanel circuloForm;
    private JTextPane txtRadio, txtPerimetro, txtArea;
    private JButton btnCalcular, btnLimpiar;

    Circulo() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularArea();
                calcularPerimetro();
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("");
                txtRadio.setText("");
                txtPerimetro.setText("");
            }
        });
    }
    public void loadForm(){
        JFrame f = new JFrame("Círculo");
        f.setContentPane(new Circulo().circuloForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    void getRadio(){
        this.radio = Integer.parseInt(txtRadio.getText());
    }

    /**
     * Método que calcula y devuelve el área de un círculo como pi
     * multiplicado por el radio al cuadrado
     * Área de un círculo
     */
    void calcularArea() {
        getRadio();
        txtArea.setText(String.format("%.3f",Math.PI*Math.pow(radio,2)));
    }
    /**
     * Método que calcula y devuelve el perímetro de un círculo como la
     * multiplicación de pi por el radio por 2
     * Perímetro de un círculo
     */
    void calcularPerimetro() {
        getRadio();
        txtPerimetro.setText(String.format("%.3f",2*Math.PI*radio));
    }
}