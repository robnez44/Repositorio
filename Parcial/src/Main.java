import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
     static ArrayList<Cliente>listaClientes = new ArrayList<Cliente>();
    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true){
            try {
                ImprimirMenu();
                opcion = sn.nextInt();
                sn.nextLine();

                if(opcion == 0){
                    System.out.println("\nHasta pronto...");
                    break;
                }

                switch (opcion){
                    case 1:
                        System.out.println("\n\t== AGREGANDO UN NUEVO CLIENTE A LA LISTA ==\n");
                        agregarCliente();
                        break;
                    case 2:
                        System.out.println("\n\t== MODIFICANDO SELECCION DEL CLIENTE==\n");
                        modificarListaCliente();
                        break;
                    case 3:
                        System.out.println("\n\t== ELIMINANDO CLIENTE DE LA LISTA ==\n");
                        eliminarCliente();
                        break;
                    case 4:
                        System.out.println("\n\t== MOSTRANDO DATOS DEL CLIENTE ==\n");
                        mostrarCliente();
                        break;
                    case 5:
                        System.out.println("\n\t== MOSTRANDO LISTA COMPLETA DE LOS CLIENTES ALMACENADOS ==\n");
                        mostrarListaCliente();
                        break;
                    default:
                        System.out.println("\nPor favor seleccione una opcion del menu\n");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("\nPor favor ingrese un dato valido\n");
                sn.nextLine();
            }
        }
    }

    private static void ImprimirMenu() {
        System.out.println("Seleccione una opcion:\n"
                + "\t1. Agregar Cliente.\n"
                + "\t2. Modificar Seleccion del paquete del cliente.\n"
                + "\t3. Eliminar Cliente de la lista.\n"
                + "\t4. Mostrar datos de un Cliente.\n"
                + "\t5. Mostrar todos los Clientes almacenados en la lista.\n"
                + "\t0. Salir"
        );
        System.out.print("Opcion: ");
    }


    private static void eliminarCliente() {
    }

    private static void mostrarListaCliente() {
    }

    private static void mostrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente del cual desea informacion: ");
        String nombre = scanner.nextLine();
        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().equals(nombre)) {
                System.out.println("-----------------------------------------------");
                System.out.println("Informacion Cliente:");
                System.out.println("-----------------------------------------------");
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("DUI: " + cliente.getDUI());
                System.out.println("Tipo de reserva: " + cliente.getTipoCliente());
                System.out.println("Numero de acompaniantes: " + cliente.getCantidadAcompaniantes());
                System.out.println("-----------------------------------------------");
                return;
            }
        }
        System.out.println("No se encontró el cliente con el nombre proporcionado.");
    }

    private static void modificarListaCliente() {
    }

    private static void agregarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el DUI del cliente:");
        String dui = scanner.nextLine();
        System.out.println("¿Qué tipo de cliente es? (VIP o Normal):");
        String tipoCliente = scanner.nextLine();
        Cliente cliente;
        if (tipoCliente.equalsIgnoreCase("VIP")) {
            cliente = crearClienteVIP(nombre, dui);
        } else {
            cliente = crearClienteNormal(nombre, dui);
        }
        listaClientes.add(cliente);
    }
    private static Cliente crearClienteVIP(String nombre, String dui) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas personas ingresan con el cliente VIP?");
        int cantidadAcompaniantes = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < cantidadAcompaniantes; i++) {
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
            int edad = scanner.nextInt();
            if (edad >= 18) {
                total += 40; // Precio por adulto
            } else {
                total += 10; // Precio por menor de edad
            }
        }
        System.out.println("Total a pagar: $" + total);
        return new ClienteVIP(new Persona(nombre, dui   ), "ID_Cliente", "VIP", 100,cantidadAcompaniantes);
    }
    private static Cliente crearClienteNormal(String nombre, String dui) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas personas ingresan con el cliente Normal?");
        int cantidadAcompaniantes = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < cantidadAcompaniantes; i++) {
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
            int edad = scanner.nextInt();
            if (edad >= 18) {
                total += 20; // Precio por adulto
            } else {
                total += 5; // Precio por menor de edad
            }
        }
        System.out.println("Total a pagar: $" + total);
        return new ClienteNormal(new Persona(nombre, dui), "ID_Cliente", "Normal",cantidadAcompaniantes);
    }

}