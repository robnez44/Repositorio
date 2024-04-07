import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
    Libro libro1 = new Libro("Libro1", "Autor1", "Editorial1", "2023131", 2000);
        Libro libro2 = new Libro("Libro2", "Autor2", "Editorial2", "2023141", 20010);
    Libreria libreria = new Libreria();
    libreria.AgregarLibro(libro1);
    libreria.AgregarLibro(libro2);
    libreria.MostrarLibros();
    }
}
