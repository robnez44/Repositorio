#include <iostream>

using namespace std;


int main () {

float numa, numb, numc, numd, nume, numf, resultado;

cout << "\nIntroduzca el valor de a: "; cin >> numa;
cout << "\nIntroduzca el valor de b: "; cin >> numb;
cout << "\nIntroduzca el valor de c: "; cin >> numc;
cout << "\nIntroduzca el valor de d: "; cin >> numd;
cout << "\nIntroduzca el valor de e: "; cin >> nume;
cout << "\nIntroduzca el valor de f: "; cin >> numf;

resultado = ((numa+numb/numc)/(numd+nume/numf));

cout << "\nEl resultado de la ecuacion es: " << resultado;

    return 0;
}