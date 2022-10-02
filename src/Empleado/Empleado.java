package Empleado;

import javax.swing.*;

public class Empleado {
    private String codigoEmpleado, nombreEmpleado;
    private double horasTrabajadas, valorHora, porcentajeReteFuente, salarioBruto, salarioNeto;
    private JPanel panel1;

    public Empleado(String codigoEmpleado, String nombreEmpleado,
             double horasTrabajadas, double valorHora, double porcentajeReteFuente){
        this.codigoEmpleado = codigoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeReteFuente = porcentajeReteFuente;
    }

    public void settingEmployeeInfo (String codigoEmpleado, String nombreEmpleado,
    double horasTrabajadas, double valorHora, double porcentajeReteFuente) {
        System.out.println("Ingresa los datos");
        //add the frame
        JFrame f = new JFrame("Red Alert!");
        //set size: width, height (in pixels)
        f.setSize(450, 475);
        //set the location (x,y)
        f.setLocation(120, 60);
        this.codigoEmpleado = codigoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeReteFuente = porcentajeReteFuente;
    }
}
