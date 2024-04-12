#include <iostream>
#include <string>

using namespace std;

struct Salario
{
    string puesto;
    float sueldo;
};

struct Horario
{
    string Horario;
    string dia;
    string turno;
};

struct Sucursal
{
    string ciudad;
    string departamento;
    int CantEmpleados;
};

int TablaSalario();
int TablaHorario();
int TablaSucursal();
void InfoEmpresa();

int TablaSalario()
{
    const int Tamanio_Tabla = 5;

    Salario tablasalarios[Tamanio_Tabla] = {
        {"Gerente", 700.0},
        {"Programador", 1300.0},
        {"Contador", 1000.0},
        {"Auditor", 1200.0},
        {"Desarrollador Web", 1100.0},

    };

    cout << "Tabla de bacantes disponibles en la empresa: " << endl;
    cout << "------------------------------------------------" << endl;
    cout << "Puesto: \t\tSalario: " << endl;
    cout << "------------------------------------------------" << endl;
    for (int i = 0; i < Tamanio_Tabla; ++i)
    {
        cout << tablasalarios[i].puesto << " \t\t"
             << "$" << tablasalarios[i].sueldo << endl;
    }
    cout << "--------------------------------------------------" << endl;
    return 0;
}

int TablaHorario()
{
    const int Tamanio_Tabla = 5;

    Horario tablahorarios[Tamanio_Tabla] = {
        {"8:00am - 16:00pm", "Lunes", "Matutino"},
        {"8:00am - 16:00pm", "Martes", "Matutino"},
        {"8:00am - 16:00pm", "Miercoles", "Matutino"},
        {"8:00am - 16:00pm", "Jueves", "Matutino"},
        {"8:00am - 16:00pm", "Viernes", "Matutino"},

    };

    cout << "Tabla de horarios de la empresa: " << endl;
    cout << "------------------------------------------------" << endl;
    cout << "Dia: \t\t Horario: \t\t Turno: " << endl;
    cout << "------------------------------------------------" << endl;
    for (int i = 0; i < Tamanio_Tabla; ++i)
    {
        cout << tablahorarios[i].dia << "\t\t"
             << tablahorarios[i].Horario << " - "
             << " \t\t"
             << tablahorarios[i].turno << endl;
    }
    cout << "--------------------------------------------------" << endl;
    return 0;
}

int TablaSucursal()
{
    const int Tamanio_Tabla = 5;

    Sucursal tablasucursales[Tamanio_Tabla] = {
        {"Ciudad Merliot", "San Salvador", 25},
        {"Santa Tecla", "San Salvador", 35},
        {"Lourdes", "La Libertad", 25},
        {"Colonia Escalon", "San Salvador", 30},
        {"Santa Ana", "Santa Ana", 20}

    };

    cout << "Tabla de todas las sucursales en El Salvador: " << endl;
    cout << "-----------------------------------------------------" << endl;
    cout << "Ciudad: \t\t Departamento: \t\t Cant.Empleados: " << endl;
    cout << "-----------------------------------------------------" << endl;
    for (int i = 0; i < Tamanio_Tabla; ++i)
    {
        cout << tablasucursales[i].ciudad << "\t\t "
             << tablasucursales[i].departamento << "  \t\t "
             << tablasucursales[i].CantEmpleados << "  \t\t " << endl;
    }
    cout << "------------------------------------------------------" << endl;
    return 0;
}

void InfoEmpresa()
{
    int opc;
    cout<<"Areas en las que trabajamos: ";
    cout<<"\n1.Desarrollo de software y paginas web al gusto del cliente.\n";
    cout<<"2.Manejar la contabilidad de nuestros clientes.\n";
    cout<<"3.Administrar o crear bases de datos para nuestros clientes.\n";
    cout<<"4.Asesoramiento informatico.\n";
    cout<<"Y MUCHAS COSAS MAS!!!!!\n ";
    cout<<"\n\t QUE ESPERAS PARA FORMAR PARTE DE ESTA GRAN FAMILIA :))\n";
    
}