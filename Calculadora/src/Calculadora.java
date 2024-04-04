public class Calculadora {
    public int suma(int x, int y) {
        return x + y;
    }

    public int resta(int x, int y) {
        return x - y;
    }

    public int multiplicacion(int x, int y) {
        return x * y;
    }

    public double division(float x, float y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN;
        }
    }
}
