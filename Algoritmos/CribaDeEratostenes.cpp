#include <iostream>
#include <vector>
using namespace std;

int main(){
    
    int n;
    vector<bool> isPrime;
    vector<int> primes;

    cin >> n;

    isPrime = vector<bool>(n, true);
    primes = vector<int>();
    
    isPrime[0] = isPrime[1] = false;
    
    for (int i=2; i<n; ++i) {
        if (isPrime[i]) {
            primes.push_back(i);
            for (int h=2; h*i<n; ++h) {
                isPrime[i*h] = 0;
            }
        }
    }
    
    for (int prime : primes) {
    cout << prime << endl;
    }
    
    return 0;
}