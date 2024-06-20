package Figuras;

public abstract class Figura {

    private int alto;

    public abstract void dibujar();

    public Figura(int alto) {
        this.alto = alto;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
}
