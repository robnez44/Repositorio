public class Camion extends Vehiculo{

    public Camion(String marca, String modelo){
        super(marca, modelo);
    }

    @Override
    public void drive() {
        System.out.println("soy un camion");
    }
}
