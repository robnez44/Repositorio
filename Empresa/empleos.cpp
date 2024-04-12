#include <iostream>
#include <string.h>
#include <list>
#include "empleados.hpp"

using namespace std;

// definicion de constructores
Trabajo::Trabajo()
{
}
Trabajo::Trabajo(string _Nombre, int _Edad, float _Salario, string _TrabajoEjercer)
{
    Nombre = _Nombre;
    Edad = _Edad;
    Salario = _Salario;
    TrabajoEjercer = _TrabajoEjercer;
}

// definicion de los get y set
void Trabajo::setNombre(string _Nombre)
{
    Nombre = _Nombre;
}
string Trabajo::getNombre()
{
    return Nombre;
}

void Trabajo::setEdad(int _Edad)
{
    Edad = _Edad;
}
int Trabajo::getEdad()
{
    return Edad;
}

void Trabajo::setSalario(float _Salario)
{
    Salario = _Salario;
}
float Trabajo::getSalario()
{
    return Salario;
}

void Trabajo::setTrabajoEjercer(string _TrabajoEjercer)
{
    TrabajoEjercer = _TrabajoEjercer;
}
string Trabajo::getTrabajoEjercer()
{
    return TrabajoEjercer;
}

// definicion de metodos
string Trabajo::AgregarEmpleado(string _Nombre, int _Edad, float _Salario, string _TrabajoEjercer)
{
    if (empleo.empty())
    {
        Trabajo *nuevoEmpleado = new Trabajo(_Nombre, _Edad, _Salario, _TrabajoEjercer);
        empleo.push_front(nuevoEmpleado); // se agrega un empleado al frente de la lista
        return "Empleado agregado a la lista correctamente. ";
    }
    else
    {
        Trabajo *nuevoEmpleado = new Trabajo(_Nombre, _Edad, _Salario, _TrabajoEjercer);
        empleo.push_back(nuevoEmpleado);
        return "\nEmpleado agregado a la lista correctamente. ";
    }
}

string Trabajo::EliminarEmpleado(string _Nombre)
{
    for (auto it = empleo.begin(); it != empleo.end(); ++it)
    {
        if ((*it)->getNombre() == _Nombre)
        {
            delete *it;       // Liberar la memoria del objeto eliminado
            empleo.erase(it); // Eliminar el elemento de la lista
            return "Empleado eliminado de la lista correctamente. ";
        }
    }
    return "El empleado no se ha encontrado en la lista. ";
}

string Trabajo::BuscarEmpleado(string _Nombre)
{
    bool encontrado = false;
    for (auto trabajo : empleo)
    {
        if (trabajo->getNombre() == _Nombre)
        {
            encontrado = true;
            cout << "\nInformacion del empleado seleccionado:\n";
            cout << "Nombre del empleado: " << trabajo->getNombre() << endl;
            cout << "Edad del empleado: " << trabajo->getEdad() << endl;
            cout << "Salario del empleado: "
                 << "$" << trabajo->getSalario() << endl;
            cout << "Ocupacion del empleado: " << trabajo->getTrabajoEjercer() << endl;
            cout << "**********************************\n";
            break;
        }
    }

    if (!encontrado)
    {
        return "El empleado no se ha encontrado en la lista. ";
    }
    else
    {
        return "Informacion del empleado encontrado exitosamente. ";
    }
}

float Trabajo::ModificarSalario(string _Nombre, float SalarioNuevo)
{
    bool encontrado = false;

    if (empleo.empty())
    {
        cout << "La lista de empleados esta vacia. " << endl;
        return 0;
    }

    for (auto trabajo : empleo)
    {
        if (trabajo->getNombre() == _Nombre)
        {
            encontrado = true;
            trabajo->getSalario();
            trabajo->setSalario(SalarioNuevo);
            return SalarioNuevo;
        }
    }

    if (!encontrado)
    {
        cout << "El empleado " << _Nombre << "no se ha encontrado en la lista. " << endl;
        return 0;
    }
}

float Trabajo::CalcularSalario(string _Nombre)
{
    bool encontrado = false;

    if (empleo.empty())
    {
        cout << "La lista de empleados esta vacia. " << endl;
        return 0;
    }

    for (auto trabajo : empleo)
    {
        if (trabajo->getNombre() == _Nombre)
        {
            encontrado = true;
            float salario = trabajo->getSalario();
            float salarioQuincenal = salario / 2;
            float salarioAnual = salario * 12;
            float salarioBono = salario + 100;

            cout << "\nInformacion del salario de " << _Nombre << ":\n";
            cout << "Salario quincenal: $" << salarioQuincenal << endl;
            cout << "Salario anual: $" << salarioAnual << endl;
            cout << "Salario mas bono por llevar trabajo al dia: $" << salarioBono << endl;
            cout << "**********************************\n";
            return salario;
        }
    }

    if (!encontrado)
    {
        cout << "El empleado " << _Nombre << " no se ha encontrado en la lista. " << endl;
        return 0;
    }
}

string Trabajo::ModificarOcupaciones(string _Nombre, string NuevoTrabajoEjercer)
{
    bool encontrado = false;

    if (empleo.empty())
    {
        cout << "La lista de empleados esta vacia. " << endl;
        return 0;
    }

    for (auto trabajo : empleo)
    {
        if (trabajo->getNombre() == _Nombre)
        {
            encontrado = true;
            trabajo->getTrabajoEjercer();
            trabajo->setTrabajoEjercer(NuevoTrabajoEjercer);
            return NuevoTrabajoEjercer;
        }
    }

    if (!encontrado)
    {
        cout << "El empleado " << _Nombre << "no se ha encontrado en la lista. " << endl;
        return 0;
    }
}

void Trabajo::MostrarLista()
{
    if (empleo.empty())
    {
        cout << "La lista de empleados esta vacia.\n";
    }
    else
    {
        cout << "\nMostrando los empleados de la lista:   \n";
        for (auto trabajo : empleo)
        {
            cout << "Nombre del empleado: " << trabajo->getNombre() << endl;
            cout << "Edad del empleado: " << trabajo->getEdad() << endl;
            cout << "Salario del empleado: "
                 << "$" << trabajo->getSalario() << endl;
            cout << "Ocupacion del empleado: " << trabajo->getTrabajoEjercer() << endl;
            cout << "--------------------------------\n";
        }
    }
}