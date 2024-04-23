package Persona;

import java.util.Date;

public class Usuario extends Persona {
    private int id;
    private String tipoUsuario;
    private static int contadorID = 0;

    //Constructors
    public Usuario(){}

    public Usuario(String DUI, String nombre, String apellido, String telefono, Date fechaNacimiento, String tipoUsuario) {
        super(DUI, nombre, apellido, telefono, fechaNacimiento);
        this.id = generarNuevoIdentificador(contadorID);
        this.tipoUsuario = tipoUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    //Metodos

}

