package Figuras;

public class Triangulo extends Figura {

    private int largo;

    @Override
    public void dibujar() {
        System.out.println("Dibujando a triangulo");
    }

    public Triangulo(int alto, int largo) {
        super(alto);
        this.largo = largo;
    }
}
