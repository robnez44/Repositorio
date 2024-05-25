public class CamionFactory extends Factory{

    @Override
    public Vehiculo createVehiculo(String marca, String modelo) {
        return new Camion(marca, modelo);
    }
}
