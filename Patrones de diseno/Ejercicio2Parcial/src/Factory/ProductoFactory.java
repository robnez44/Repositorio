package Factory;

public class ProductoFactory {
    public static Producto CrearProducto(String tipo, String descripcion, double precio){
        switch (tipo.toLowerCase()){
            case "lacteo":
                return new ProductoLacteo(descripcion,precio);
            case "panaderia":
                return new ProductoPanaderia(descripcion,precio);
            default:
                throw new IllegalArgumentException("el producto ingresado no existe.");
        }
    }

}
