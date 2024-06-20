import Figuras.Circulo;
import Figuras.Figura;
import Figuras.TipoFIgura;
import Figuras.Triangulo;

import java.util.Scanner;

public class FiguraFactory {
    public static Figura crearFigura(TipoFIgura figura) throws ClassNotFoundException {

        switch (figura){
            case CIRCULO:
                return new Circulo(3, 4);
            case CUADRADO:
                return new Circulo(2, 5);
            case TRIANGULO:
                return new Triangulo(3, 4);
            default:
                throw new ClassNotFoundException(figura.name() + "no es una figura existente");
        }

    }
}
