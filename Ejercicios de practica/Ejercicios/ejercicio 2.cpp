#include <iostream>

using namespace std;

int main () {

float precio, iva, preciva;

cout << "ingrese el precio del producto el cual desea sacarle iva: ";
cin >> precio;

iva= precio*0.13;
preciva = precio + iva;

cout << "\nEl precio del producto con iva es: " << preciva;

    return 0;

}