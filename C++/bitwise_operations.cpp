#include <bits/stdc++.h>
using namespace std;

// << correr 1 n espacios a la izquierda
// >> correr 1 n espacios a la derecha
// & operador 'and' 
// | operador 'or'
// ^ operador 'xor'
// ~ operador 'not'

int main(){

    cout << (2<<1) << endl;
    // 2 = 10; 2<<1 = 4 (4 = 100)
    cout << (2>>1) << endl;
    // 2 = 10; 2>>1 = 1 (1 = 01)
    cout << (2&1) << endl;
     // 2 = 10
     // 1 = 01
     // 10 & 01 = 00 (00 = 0)
    cout << (2|1) << endl; 
    // 2 = 10
    // 1 = 01
    // 10 | 01 = 11 (11 = 3)
    cout << (3^1) << endl; 
    // 3 = 11
    // 1 = 01
    // 11 ^ 01 = 10 (10 = 2)
    cout << (10&~4) << endl;
    // 10 = 1010
    // 4 = 0100 
    // ~4 = 1011
    // 10 & ~4 = 1010 (1010 = 10)
    cout << (int)0b1001; // imprime 9
    return 0;
}