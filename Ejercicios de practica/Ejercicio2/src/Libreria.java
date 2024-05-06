import java.util.ArrayList;
import java.util.List;

public class Libreria{
    private List<Libro> libros;

    public Libreria() {
        this.libros = new ArrayList<>();
    }

    public void AgregarLibro(Libro libro){
        libros.add(libro);
    }

    public void EliminarLibro(Libro libro){
        libros.remove(libro);
    }

    public void MostrarLibros(){
        if(!libros.isEmpty()){
            for (Libro libro : libros) {
                System.out.println("Titulo: " + libro.getTitulo() + "\nAutor: " + libro.getAutor() + "\nEditorial: " + libro.getEditorial() + "\nISBN: " + libro.getAutor() + "\nAno de publicacion: " + libro.getAno());
                System.out.println("----------------------------------------");
            }
        } else {
            System.out.println("No hay libros");
        }
    }
}
