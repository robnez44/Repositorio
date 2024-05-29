package Composite;
import java.util.ArrayList;
import java.util.List;
//se usa el patron de disenio composite para manejar para manejar categorias
public abstract class ComponenteProducto {
    //atributos propios de la clase
    protected String nombre;


    //se crea un constructor
    public ComponenteProducto(String nombre) {
        this.nombre = nombre;
    }

    //metodos de la clase
    public void Agregar(ComponenteProducto componente){
        throw new UnsupportedOperationException();
    }
    /*
    Este método lanza una excepción UnsupportedOperationException cuando se llama.
    Esto indica que la operación no es soportada por la clase que está usando este método.
     */

    public void Eliminar(ComponenteProducto componente){
        throw new UnsupportedOperationException();
    }

    public ComponenteProducto obtenerHijo(int i){
        throw new UnsupportedOperationException();
    }
    /*
    En la clase base ComponenteProducto, el método obtenerHijo está diseñado para obtener un componente
    hijo en una posición específica. Sin embargo, no todos los componentes del patrón Composite tienen hijos.
    Por ejemplo, un ProductoSimple no tiene hijos, mientras que una CategoriaProducto puede tener varios hijos.
     */

    //getter del atributp
    public String getNombre() {
        return nombre;
    }

    public abstract void mostrarDetalles();
}
