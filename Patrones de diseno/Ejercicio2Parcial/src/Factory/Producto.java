package Factory;
//creando una interfaz que son las que implemetaran las clases concretas
public abstract class Producto {
    //atributos que heredaran las clases concretas
    private String descripcion;
    protected double precio;

    //creando constructor
    public Producto(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecio(){
        return precio;
    }
}
