package FigurasGeometricas;

import javax.swing.*;
import java.awt.event.*;

public class Rombo {
    int lado;
    int diametroMayor;
    int diametroMenor;
    private JPanel romboForm;
    private JTextPane txtArea, txtLado, txtPerimetro, txtDiametroMayor, txtDiametroMenor;
    private JButton btnCalcular, btnLimpiar;

    public Rombo() {
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
                txtLado.setText("");
                txtPerimetro.setText("");
                txtDiametroMayor.setText("");
                txtDiametroMenor.setText("");
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Rectángulo");
        f.setContentPane(new Rombo().romboForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }

    private void settingInfo(){
        this.lado = Integer.parseInt(txtLado.getText());
        this.diametroMayor = Integer.parseInt(txtDiametroMayor.getText());
        this.diametroMenor = Integer.parseInt(txtDiametroMenor.getText());
    }

    private void calcularArea() {
        txtArea.setText(String.valueOf((diametroMayor * diametroMenor) / 2.0));
    }

    private void calcularPerimetro() {
        txtPerimetro.setText(String.valueOf(4*lado));
    }
}
