#include <iostream>

using namespace std;

int mcd(int, int);

int main(){

    int x = 156, y = 120;
    cout << mcd(x, y);

    return 0;
}

int mcd(int a, int b) {
    while (b != 0)
    {
        int residuo = a % b;
        a = b;
        b = residuo;
    }
    return a;
}