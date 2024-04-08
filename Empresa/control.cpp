#include <iostream>
#include <string>

using namespace std;

// Función para verificar la contraseña de administrador
bool verificarContrasenia(string contrasenia) {
    // Contraseñas predeterminadas para los administradores
    string contraseniaAdmin = "admin123";
    
    // Verificar si la contraseña coincide con la del administrador
    return contrasenia == contraseniaAdmin;
}

int main() {
    char opcion;
    string contrasenia, nombre;

    // Mostrar menú inicial
    cout << "¿Es usted un administrador? (S/N): ";
    cin >> opcion;

    // Limpiar el búfer después de leer la opción
    cin.ignore();

    cout << "Ingrese su nombre: ";
    getline(cin, nombre);

    if (opcion == 'S' || opcion == 's') {
        cout << "Ingrese la contraseña: ";
        cin >> contrasenia;

        // Verificar la contraseña del administrador
        if (verificarContrasenia(contrasenia)) {
            cout << "Bienvenido " << nombre << "." << endl;
            // Aquí pondrías el código para el menú de administrador
        } else {
            cout << "Contraseña incorrecta. Acceso denegado." << endl;
            // Aquí podrías regresar al menú principal o hacer algo más
        }
    } else {
        cout << "Bienvenido, usuario " << nombre << "." << endl;
        // Aquí pondrías el código para el menú de usuario regular
    }

    return 0;
}
