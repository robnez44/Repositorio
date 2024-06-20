package Figuras;

public class Cuadrado extends Figura {

    private int largo;

    @Override
    public void dibujar() {
        System.out.println("Figuras.Cuadrado dibujar");
    }

    public Cuadrado(int alto, int largo) {
        super(alto);
        this.largo = largo;
    }
}
