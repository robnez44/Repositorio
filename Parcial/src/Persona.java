import java.util.Date;
public class Persona {
    //atributos
    private String nombre;
    private String DUI;

    //constructores
    public Persona() {}

    public Persona(String nombre, String DUI) {
        this.nombre = nombre;
        this.DUI = DUI;

    }

    public Persona(Persona persona){
        nombre = persona.nombre;
        DUI = persona.DUI;
    }
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

}

