package Decorator;

import Factory.Producto;
//se implementa el patron decorator para agregar caracteristicas adicionales a los productos
public abstract class ProductoDecorator extends Producto {
    protected Producto producto;
    //creando un constructor
    public ProductoDecorator(String descripcion, double precio, Producto producto) {
        super(descripcion, precio);
        this.producto = producto;
    }

    //agregando metodos de la clase abstracta Producto\
    @Override
    public String getDescripcion(){
        return producto.getDescripcion();
    }

    @Override
    public double getPrecio(){
        return producto.getPrecio();
    }
}
