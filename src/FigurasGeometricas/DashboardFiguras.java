package FigurasGeometricas;

import javax.swing.*;
import java.awt.event.*;

public class DashboardFiguras {
    private JPanel dashboardFigForm;
    private JButton btnCirculo, btnRectangulo, btnCuadrado, btnTrianguloRectangulo, btnRombo, btnTrapecio;

    public DashboardFiguras() {
        btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Circulo circulo = new Circulo();
                circulo.loadForm();
            }
        });
        btnRectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.loadForm();
            }
        });
        btnCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cuadrado cuadrado = new Cuadrado();
                cuadrado.loadForm();
            }
        });
        btnTrianguloRectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo();
                trianguloRectangulo.loadForm();
            }
        });
        btnRombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rombo rombo = new Rombo();
                rombo.loadForm();
            }
        });
        btnTrapecio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Trapecio trapecio = new Trapecio();
                trapecio.loadForm();
            }
        });
    }

    public void loadForm(){
        JFrame f = new JFrame("Círculo");
        f.setContentPane(new DashboardFiguras().dashboardFigForm);
        f.pack();
        f.setLocation(400, 60);
        f.setVisible(true);
        f.setResizable(false);
    }
}
