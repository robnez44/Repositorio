package Factory;

public class ProductoLacteo extends Producto {
    //agregando constructor de la clase padre
    public ProductoLacteo(String descripcion, double precio) {
        super(descripcion, precio);
    }
    //agregando metodos de la clase abstracta
    @Override
    public String getDescripcion(){
        return super.getDescripcion() + "(Lacteos)";
    }

    @Override
    public double getPrecio(){
        return super.getPrecio();
    }






}
