#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{

    int n;
    vector<int> lista(n);


    cin >> n;

    for (int i = 0; i < n; ++i)
    {
        cin >> lista[i];
    }

    vector<int> sublista(lista);

    

    return 0;

}