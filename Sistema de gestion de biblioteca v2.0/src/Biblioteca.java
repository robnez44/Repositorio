import java.util.ArrayList;
import java.util.List;
import Libro.*;
import Persona.*;

public class Biblioteca {

    private List<Libro> libros;
    private List<Empleado> empleados;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public Biblioteca(List<Libro> libros, List<Empleado> empleados, List<Usuario> usuarios) {
        this.libros = libros;
        this.empleados = empleados;
        this.usuarios = usuarios;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Empleado> getEmplleados() {
        return empleados;
    }

    public void setEmplleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    //Metodos
    public void nuevoLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void nuevoEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public void nuevoUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void mostrarLibros() {
        for (int i = 0; i < libros.size(); i++) {
            Libro libroTemp = libros.get(i);
            System.out.println(libroTemp.getTitulo());

        }
    }
}
