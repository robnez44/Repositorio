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

//definicion de los get y set
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

//definicion de metodos
string Trabajo::AgregarEmpleado(string _Nombre, int _Edad, float _Salario, string _TrabajoEjercer)
{
    //codigo a escribir
}

string Trabajo::EliminarEmpleado(string _Nombre)
{
    //codigo a escribir
}

string Trabajo::BuscarEmpleado(string _Nombre)
{
    //codigo a escribir
}

float Trabajo::ModificarSalario(string _Nombre, float _Salario)
{
    //codigo a escribir
}

float Trabajo::CalcularSalario(string _Nombre, float _Salario)
{
    //codigo a escribir
}

string Trabajo::ModificarOcupaciones(string _Nombre, string _TrabajoEjercer)
{
    //codigo a escribir
}

void Trabajo::MostrarLista()
{
    //codigo a escribir
}