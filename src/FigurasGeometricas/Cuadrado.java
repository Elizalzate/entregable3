package FigurasGeometricas;

import javax.swing.*;
import java.awt.event.*;

public class Cuadrado {
    int lado;
    private JTextPane txtLado, txtArea, txtPerimetro;
    private JButton btnCalcular, btnLimpiar;
    private JPanel cuadradoForm;

    public Cuadrado() {
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
                txtLado.setText("");
                txtArea.setText("");
                txtPerimetro.setText("");
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Cuadrado");
        f.setContentPane(new Cuadrado().cuadradoForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    void settingInfo(){
        this.lado = Integer.parseInt(txtLado.getText());
    }

    public void calcularArea() {
        txtArea.setText(String.valueOf(lado*lado));
    }

    public void calcularPerimetro() {
        txtPerimetro.setText(String.valueOf(4*lado));
    }
}

