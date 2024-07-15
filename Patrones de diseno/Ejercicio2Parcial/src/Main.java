import Composite.CategoriaProducto;
import Composite.ProductoSimple;
import Decorator.ProductoDescuento;
import Factory.Producto;
import Factory.ProductoFactory;
import Factory.ProductoLacteo;
import Iterator.Inventario;
import Singleton.Tienda;

public class Main { 
    public static void main(String[] args) {

        //configuracion de la tienda usando singleton
        Tienda tienda = Tienda.getInstance();
        tienda.setNombre("Supermercado Selectos");
        tienda.setUbicacion("Plaza El Encuentro");

        //mostrando informacion de la tienda
        System.out.println("\n\tINFORMACION DEL SUPERMERCADO: \n");
        System.out.println("Nombre del supermercado: " + tienda.getNombre());
        System.out.println("Ubicacion del supermercado: " + tienda.getUbicacion());

        //creando productos usando factory
        Producto leche = ProductoFactory.CrearProducto("Lacteo", "Leche - ",1.50);
        Producto pan = ProductoFactory.CrearProducto("Panaderia","pan - ",0.75);

        //decorar producto con descuento
        Producto lecheConDescuento = new ProductoDescuento(leche,0.10);
        Producto PanConDescuento = new ProductoDescuento(pan,0.15);

        //agregando productos al inventario usando iterator
        Inventario invent = new Inventario();
        invent.AgregarProducto(lecheConDescuento);
        invent.AgregarProducto(PanConDescuento);

        System.out.println("\n\t-------------------------------------\n");
        System.out.println("Inventario de la tienda: \n");
        for(Producto producto : invent){
            System.out.println(producto.getDescripcion() + " - $" + producto.getPrecio());
        }

        //creando estructura jerarquica de productos usando composite
        CategoriaProducto lacteos = new CategoriaProducto("\tLacteos: ");
        lacteos.Agregar(new ProductoSimple("- Leche Salud ", 1.50));
        lacteos.Agregar(new ProductoSimple("- Queso fresco ",0.80));
        lacteos.Agregar(new ProductoSimple("- Queso crema ",1.00));

        CategoriaProducto panaderia = new CategoriaProducto("\tPanaderia: ");
        panaderia.Agregar(new ProductoSimple("- Pan frances ",0.50));
        panaderia.Agregar(new ProductoSimple("- Croissant ",0.70));
        panaderia.Agregar(new ProductoSimple("- Semita ",0.75));

        CategoriaProducto supermercado = new CategoriaProducto("SUPERMERCADO");
        supermercado.Agregar(lacteos);
        supermercado.Agregar(panaderia);

        System.out.println("\n\tEstructura del supermercado: \n");
        supermercado.mostrarDetalles();




    }
}