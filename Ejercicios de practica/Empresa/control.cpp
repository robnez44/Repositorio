#include <iostream>
#include <string.h>
#include <list>
#include <conio.h>
#include "empleos.cpp"
#include "usuario.cpp"
#include <stdlib.h>

using namespace std;

void menu(Trabajo &trabajo);
void menuUsuario();
// Función para verificar la contraseña de administrador
bool verificarContrasenia(string contrasenia)
{
    // Contraseñas predeterminadas para los administradores
    string contraseniaAdmin = "empanadita123";

    // Verificar si la contraseña coincide con la del administrador
    return contrasenia == contraseniaAdmin;
}

int main()
{
    char opcion, opcionSalir;
    string contrasenia, nombre;
    int opc;
    // se crea el objeto
    Trabajo trabajo;
    // Mostrar menú inicial
    do
    {
        cout << "¿Es usted un administrador? (S/N): ";
        cin >> opcion;

        // Limpiar el búfer después de leer la opción
        cin.ignore();

        cout << "Ingrese su nombre: ";
        getline(cin, nombre);

        if (opcion == 'S' || opcion == 's')
        {
            cout << "Ingrese la contrasenia: ";
            cin >> contrasenia;

            // Verificar la contrasenia del administrador
            if (verificarContrasenia(contrasenia))
            {
                cout << "Bienvenido " << nombre << "." << endl;
                menu(trabajo);
            }
            else
            {
                cout << "Contrasenia incorrecta. Acceso denegado." << endl;
            }
        }
        else
        {
            cout << "Bienvenido, usuario " << nombre << "." << endl;
            menuUsuario();
        }
        cout << "Desea salir del programa? (s/n: )";
        cin >> opcionSalir;
        if (opcionSalir == 'S' || opcionSalir == 's')
        {
            break;
        }
    } while (true);
    cout << "Gracias por utilizar el programa. Espero lo haya disfrutado, Adios!!!";

    getch();
    return 0;
}

void menu(Trabajo &trabajo)
{
    // declaracion de funciones
    int opc, edad, opc2;
    float salario, SalarioNuevo;
    string nombre, ocupacion, ocupacionNueva;
    char regresar;

    do
    {
        // menu
        cout << "\n\tMENU:\n";
        cout << "\n1.Agregar un empleado a la lista.\n";
        cout << "2.Eliminar un empleado de la lista.\n";
        cout << "3.Buscar un empleado en la lista.\n";
        cout << "4.Modificar el salario de un empleado.\n";
        cout << "5.Calcular salario de algun empleado.\n";
        cout << "6.Modificar ocupaciones de empleado.\n";
        cout << "7.Mostrar lista de empleados.\n";
        cout << "8.Salir del programa.\n";
        cout << "Opcion: ";
        cin >> opc;

        switch (opc)
        {
        case 1:
            cout << "\n\t==AGREGAR EMPLEADO==\n";
            // solicitar datos
            cout << "Ingrese nombre del empleado: ";
            cin.ignore();
            getline(cin, nombre);
            cout << "Ingrese la edad del empleado: ";
            cin >> edad;
            cout << "Ingrese el salario del empleado: "
                 << "$";
            cin >> salario;
            cout << "Ingrese el rol que desarrolla en la empresa: ";
            cin.ignore();
            getline(cin, ocupacion);
            cout << trabajo.AgregarEmpleado(nombre, edad, salario, ocupacion); // llamada de la funcion Agregarempleado
            cout << "\n";
            system("pause");
            break;

        case 2:
            cout << "\n\t==ELIMINAR EMPLEADO==\n";
            // solicitar datos
            cout << "Ingrese el nombre del empleado a eliminar: ";
            cin.ignore();
            getline(cin, nombre);
            cout << trabajo.EliminarEmpleado(nombre); // llamada de la funcion Eliminarempleado
            cout << "\n";
            system("pause");
            break;

        case 3:
            cout << "\n\t==BUSCAR  EMPLEADO==\n";
            // solicitar datos
            cout << "Ingrese el nombre del empleado a buscar: ";
            cin >> nombre;
            cout << trabajo.BuscarEmpleado(nombre); // llamada de la fucion Buscarempleado
            cout << "\n";
            system("pause");
            break;

        case 4:
            cout << "\n\t==MODIFICAR SALARIO==\n";
            // solicitar datos
            cout << "Ingrese el nombre del empleado al que desearia cambiarle el salario: ";
            cin >> nombre;
            cout << "Ingrese el nuevo salario que tendria el empleado: "
                 << "$";
            cin >> SalarioNuevo;
            cout << "El nuevo salario del empleado es: "
                 << "$" << trabajo.ModificarSalario(nombre, SalarioNuevo);
            cout << "\n";
            system("pause");
            break;

        case 5:
            cout << "\n\t==CALCULAR SALARIO==\n";
            cout << "Ingrese el nombre del empleado: ";
            cin >> nombre;
            cout << trabajo.CalcularSalario(nombre) << endl;
            cout << "\n";
            system("pause");
            break;

        case 6:
            cout << "\n\t==MODIFICAR OCUPACIONES==\n";
            // solicitar datos
            cout << "Ingrese el nombre del empleado al cual desearia cambiarle su ocupacion: ";
            cin >> nombre;
            cout << "Ingrese la nueva ocupacion del empleado: ";
            cin >> ocupacionNueva;
            cout << "La nueva ocupacion del empleado sera: " << trabajo.ModificarOcupaciones(nombre, ocupacionNueva);
            cout << "\n";
            system("pause");
            break;

        case 7:
            cout << "\n\t==MOSTRAR LISTA==\n";
            // solicitar datos
            trabajo.MostrarLista(); // llamada de la funcion de mostrar la lista de empleados.
            cout << "\n";
            system("pause");
            break;

        case 8:
            cout << "Saliendo del programa..." <<endl;
            return;
        }
        cout << "Le gustaria regresar al menu principal? (s/n): ";
        cin >> regresar;
        system("cls");

    } while (regresar == 's' || regresar == 'S'); // condicional del bucle
}

void menuUsuario()
{
    int opc;
    char regresar;

    cout << "\nInformacion sobre la empresa:\n";
    do
    {
        cout << "\n\tMENU:\n";
        cout << "\n1.Informacion sobre salarios:\n";
        cout << "2.Informacion sobre horarios:\n";
        cout << "3.Informacion sobre sucursales:\n";
        cout << "4.Informacion sobre lo que se hace en la empresa:\n";
        cout << "5.Salir del programa.\n";
        cout << "Opcion: ";
        cin >> opc;

        switch (opc)
        {
        case 1:
            cout <<"\n\t==Sueldos==\n";
            TablaSalario();
            system("pause");
            break;

        case 2:
            cout << "\n\t==Horarios==\n";
            TablaHorario();
            system("pause");
            break;

        case 3:
            cout << "\n\t==Sucursales==\n";
            TablaSucursal();
            system("pause");
            break;

        case 4:
            cout << "\n\t==Informacion de la empresa==\n";
            InfoEmpresa();
            system("pause");
            break;

        case 5:
            cout << "Saliendo del programa..." <<endl;
            return;
        }
        cout << "Le gustaria regresar al menu principal: (s/n):";
        cin >> regresar;
        system("cls");

    } while (regresar == 's' || regresar || 'S');
}