public class CarroFactory extends Factory{
    @Override
    public Vehiculo createVehiculo(String marca, String modelo) {
        return new Carro(marca, modelo);
    }
}
