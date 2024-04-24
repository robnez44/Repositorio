#include <iostream>

using namespace std;

int main () {

float numa, numb,numc,numd, resultado;

cout << "\nIntroduzca el valor de a: "; cin >> numa;
cout << "\nIntroduzca el valor de b: "; cin >> numb;
cout << "\nIntroduzca el valor de c: "; cin >> numc;
cout << "\nIntroduzca el valor de d: "; cin >> numd;

resultado = (numa+numb)/(numc+numd);

cout << "\nEl resultado de la operacion es: " << resultado <<endl;

    return 0;

}