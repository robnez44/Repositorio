package Iterator;
import Factory.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//usamos iterator para recorrer la lista prodcutos de la tienda
public class Inventario implements Iterable<Producto>{
    private List<Producto> productos = new ArrayList<>();
    public void AgregarProducto(Producto producto){
        productos.add(producto);
    }
    @Override
    public Iterator<Producto> iterator(){
        return productos.iterator();
    }
}
