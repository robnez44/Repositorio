package Persona;

import java.util.Date;

public class Empleado extends Persona{
    private float salario;
    private int carnet;
    private static int contadorCarnet = 0;

    //Constructors

    public Empleado(float salario) {
        this.salario = salario;
        this.carnet = generarNuevoIdentificador(contadorCarnet);
    }

    public Empleado() {}

    public Empleado (String DUI, String nombre, String apellido, String telefono, Date fechaNacimiento, float salario) {
        super(DUI, nombre, apellido, telefono, fechaNacimiento);
        this.salario = salario;
        this.carnet = generarNuevoIdentificador(contadorCarnet);
    }

    //Getters and Setters
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    //Metodo
}



