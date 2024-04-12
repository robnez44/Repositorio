#include <iostream>
#include <string.h>
#include <list>

using namespace std;

// clase
class Trabajo
{
    // atributos
private:
    string Nombre;
    int Edad;
    float Salario;
    string TrabajoEjercer;

public:
    // constructores
    Trabajo();
    Trabajo(string, int, float, string);

    // get y set
    void setNombre(string _Nombre);
    string getNombre();

    void setEdad(int _Edad);
    int getEdad();

    void setSalario(float _Salario);
    float getSalario();

    void setTrabajoEjercer(string _TrabajoEjercer);
    string getTrabajoEjercer();

    // metodos
    string AgregarEmpleado(string, int, float, string);
    string EliminarEmpleado(string);
    string BuscarEmpleado(string);
    float ModificarSalario(string, float);
    float CalcularSalario(string);
    void MostrarLista();
    string ModificarOcupaciones(string, string);
};

list<Trabajo *>empleo;