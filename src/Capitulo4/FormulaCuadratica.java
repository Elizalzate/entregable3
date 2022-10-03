package Capitulo4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormulaCuadratica {
    private double A, B, C, raiz, x1, x2;

    private JPanel cuadraticaForm;
    private JLabel lblA, lblB, lblC;
    private JTextPane txtValorA, txtValorB, txtValorC;
    private JButton btnCalcular, btnLimpiar;
    private JLabel lblX1;
    private JLabel lblX2;
    private JTextPane txtX1;
    private JTextPane txtX2;

    public FormulaCuadratica() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingInfo();
                calcularFormulaCuadratica(A,B,C,raiz);
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtValorA.setText("");
                txtValorB.setText("");
                txtValorC.setText("");
            }
        });
    }

    public void loadForm(){
        //add the frame
        JFrame f = new JFrame("Fórmula cuadrática");
        f.setContentPane(new FormulaCuadratica().cuadraticaForm);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        //set the location (x,y)
        f.setLocation(600, 60);
        f.setVisible(true);
        f.setResizable(false);
    }
    public void settingInfo(){
        this.A = Double.parseDouble(txtValorA.getText());
        this.B = Double.parseDouble(txtValorB.getText());
        this.C = Double.parseDouble(txtValorC.getText());
        this.raiz = Math.pow(B, 2) - (4 * A * C);
    }

    public void calcularFormulaCuadratica ( double A, double B, double C, double raiz){
        if (raiz < 0) {
            txtX1.setText("No existe");
            txtX2.setText("No existe");
            JOptionPane.showMessageDialog(cuadraticaForm,
                    "Las soluciones para la ecuación cuadratica son soluciones complejas");
        }
        else if (raiz == 0) {
            txtX1.setText(String.valueOf((-B + Math.sqrt(raiz)) / (2 * A)));
            JOptionPane.showMessageDialog(cuadraticaForm,"La ecuación cuadratica tiene sólo una solución " +
                    "X= " + (-B + Math.sqrt(raiz)) / (2 * A));
        }
        else {
            txtX1.setText(String.valueOf(x1));
            txtX2.setText(String.valueOf(x2));
            x1 = (-B + Math.sqrt(raiz)) / (2 * A);
            x2 = (-B - Math.sqrt(raiz)) / (2 * A);
            JOptionPane.showMessageDialog(cuadraticaForm,
                    "Las dos posibles soluciones para la ecuación de segundo grado " +
                    "son: X1 = " + x1 + " y X2 = " + x2);
        }
    }
}
