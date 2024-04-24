#include <iostream>

using namespace std;

int main () {

float numa, numb, numc, numd, resultado;

cout << "Introduzca el valor de a: "; cin >> numa;
cout << "Introduzca el valor de b: "; cin >> numb;
cout << "Introduzca el valor de c: "; cin >> numc;
cout << "Introduzca el valor de d: "; cin >> numd;

resultado = (numa + (numb/(numc - numd)));

cout << "El resultado de la ecaucion es: " << resultado;

}