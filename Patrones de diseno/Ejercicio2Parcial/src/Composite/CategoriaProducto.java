package Composite;

import java.util.ArrayList;
import java.util.List;

public class CategoriaProducto extends ComponenteProducto{
    private List<ComponenteProducto> componentes = new ArrayList<>();

    public CategoriaProducto(String nombre) {
        super(nombre);
    }

    //heredando metodos de la clase padre
    @Override
    public void Agregar(ComponenteProducto componente){
        componentes.add(componente);
    }
    @Override
    public void Eliminar(ComponenteProducto componente){
        componentes.remove(componente);
    }
    @Override
    public ComponenteProducto obtenerHijo(int i){
        return componentes.get(i);
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Categoria: " + nombre);
        for(ComponenteProducto componente : componentes){
            componente.mostrarDetalles();
        }
    }
}
