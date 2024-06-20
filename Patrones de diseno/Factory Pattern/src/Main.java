import Figuras.Figura;
import Figuras.TipoFIgura;

public class Main {
    public static void main(String[] args) {
        try {
            Figura figura = FiguraFactory.crearFigura(TipoFIgura.CIRCULO);
            figura.dibujar();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}