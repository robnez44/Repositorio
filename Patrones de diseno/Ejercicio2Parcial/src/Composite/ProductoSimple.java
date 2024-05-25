package Composite;
//se crean clases concretas para productos y categorias y esta clase hereda de ComponenteProductos
public class ProductoSimple extends ComponenteProducto{
    //atributo propio de la clase
    private double precio;

    //constructor de la clase
    public ProductoSimple(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
    }

    //agregando funcion heredada
    @Override
    public void mostrarDetalles(){
        System.out.println(nombre + ": $" + precio);
    }
}
