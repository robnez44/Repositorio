package Libro;

public abstract class Libro {
    protected String titulo;
    protected String autor;
    protected String editorial;
    protected String genero;

    //Constructores
    public Libro(){}

    public Libro(String titulo, String autor, String editorial, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Metodos
    public static int generarISBN(int isbn){
        isbn++;
        return isbn;
    }
}
