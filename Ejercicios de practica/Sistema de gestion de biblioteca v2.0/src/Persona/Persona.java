package Persona;

import java.util.Date;

public abstract class Persona {
    protected String DUI;
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected Date fechaNacimiento;

    //Constructors
    public Persona(){}

    public Persona(String DUI, String nombre, String apellido, String telefono, Date fechaNacimiento) {
        this.DUI = DUI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }


    //Getters and Setters
    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //Metodos
    public static int generarNuevoIdentificador(int identificador){
        identificador++;
        return identificador;
    }
}
