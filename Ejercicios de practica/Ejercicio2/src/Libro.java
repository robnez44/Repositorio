public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private String isbn;
    private int ano;

    public Libro(String titulo, String autor, String editorial, String isbn, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAno() {
        return ano;
    }
}