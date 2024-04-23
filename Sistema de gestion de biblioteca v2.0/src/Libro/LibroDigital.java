package Libro;

public class LibroDigital extends Libro{

    private String formato;

    //Constructors
    public LibroDigital() {
    }

    public LibroDigital(String titulo, String autor, String editorial, String genero, String formato) {
        super(titulo, autor, editorial, genero);
        this.formato = formato;
    }

    //Getters and Setters
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
