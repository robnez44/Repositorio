package Singleton;
//creando clase singleton
public class Tienda {
    private static Tienda instance;
    private String nombre;
    private String ubicacion;

    //creando constructor privado para asegurarse que no se creen instancias de la clase
    private Tienda() {}

    public static Tienda getInstance(){
        if(instance == null){
            instance = new Tienda();
        }
        return instance;
    }

    //creando getters y setters de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
