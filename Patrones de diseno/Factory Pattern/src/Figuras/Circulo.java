package Figuras;

public class Circulo extends Figura {

    private double radio;

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo");
    }

    public Circulo(int alto, double radio) {
        super(alto);
        this.radio = radio;
    }

}
