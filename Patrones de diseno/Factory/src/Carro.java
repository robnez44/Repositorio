public class Carro extends Vehiculo {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void drive() {
        System.out.println("soy un carro");
    }


}
