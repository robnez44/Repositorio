package Factory;

public class ProductoPanaderia extends Producto{
    //agregando constructor de la clase padre
    public ProductoPanaderia(String descripcion, double precio) {
        super(descripcion, precio);
    }

    //agregando metodos de la clase padre
    @Override
    public String getDescripcion(){
        return super.getDescripcion() + "(Panaderia)";
    }

    @Override
    public double getPrecio(){
        return super.getPrecio();
    }
}
