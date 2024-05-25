import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factory factory = null;
        Vehiculo vehiculo;

        boolean flag = true;

        while(flag) {
            System.out.println("\n\nHello, what do you want to create?\n1. Car.\n2. Truck.\n0.Salir.");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    factory = new CarroFactory();
                    break;
                case 2:
                    factory = new CamionFactory();
                    break;
                default:
                    flag = false;
                    break;
            }

            if (flag){
                vehiculo = factory.createVehiculo("ferrari", "f50");
                vehiculo.drive();
                System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());
            }
    }
} }