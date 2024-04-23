package Libro;

public class LibroFisico extends Libro {
    private int ISBN;
    private int contadorISBN = 0;

    public LibroFisico() {
        this.ISBN = generarISBN(contadorISBN);
    }

    public LibroFisico(int ISBN, int contadorISBN) {
        this.ISBN = ISBN;
        this.contadorISBN = contadorISBN;
    }

    //Getter and Setter
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
