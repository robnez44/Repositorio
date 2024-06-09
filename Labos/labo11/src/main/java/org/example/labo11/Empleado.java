package org.example.labo11;

public class Empleado implements Comparable<Empleado> {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return nombre + " - Age: " + edad + ", Salary: " + salario;
    }

    @Override
    public int compareTo(Empleado o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
