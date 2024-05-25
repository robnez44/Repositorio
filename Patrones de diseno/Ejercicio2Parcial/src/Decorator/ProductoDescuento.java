package Decorator;

import Factory.Producto;

public class ProductoDescuento extends Producto{
    //atributo propio de la clase
    private Producto producto;
    private double descuento;

    //se crea un constructor
    public ProductoDescuento(Producto producto, double descuento) {
        super(producto.getDescripcion(), producto.getPrecio());
        this.producto = producto;
        this.descuento = descuento;
    }

    //se implementan los metodos de la clase abstracta de Producto
    @Override
    public String getDescripcion(){
        return producto.getDescripcion() + "Con descuento";
    }

    @Override
    public double getPrecio(){
        return producto.getPrecio() * (1-descuento);
    }
}
