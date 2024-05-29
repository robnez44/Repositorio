#include <iostream>
using namespace std;

int main()
{

    string word1, word2;
    string vowel1, vowel2;
    string newWord1, newWord2Inverted, newWord2;
    string superWord;

    cin >> word1;
    cin >> word2;

    for (int i = 1; i < word1.size(); ++i) // Saving the vowel
    {
        if (word1.at(i) == 'a' || word1.at(i) == 'e' || word1.at(i) == 'i' || word1.at(i) == 'o' || word1.at(i) == 'u')
        {
            vowel1 += word1.at(i);
            break;
        }
    }
    for (int i = 1; i < word1.size(); ++i) // Saving the word since second character
    {
        if (word1.at(i) != 'a' && word1.at(i) != 'e' && word1.at(i) != 'i' && word1.at(i) != 'o' && word1.at(i) != 'u')
        {
            newWord1 += word1.at(i);
        }
        else
        {
            break;
        }
    }

    for (auto j = word2.end() - 2; j != word2.begin(); --j) // saving the vowel
    {
        if (*j == 'a' || *j == 'e' || *j == 'i' || *j == 'o' || *j == 'u')
        {
            vowel2 += *j;
            break;
        }
    }
    for (auto j = word2.end() - 2; j != word2.begin(); --j)
    {
        if (*j != 'a' && *j != 'e' && *j != 'i' && *j != 'o' && *j != 'u')
        {
            newWord2Inverted += *j;
        }
        else
        {
            break;
        }
    }
    for (int i = newWord2Inverted.length() - 1; i >= 0; --i) // sorting newWordInverted to the original order
    {
        newWord2 += newWord2Inverted[i];
    }

    if (vowel1.empty() && vowel2.empty())
    {
        superWord += word1.front() + newWord1 + "o" + word2.front() + newWord2 + word2.back();
        cout << superWord << "\n";
    }
    else if (!vowel2.empty())
    {
        superWord += word1.front() + newWord1 + vowel2 + newWord2 + word2.back();
        cout << superWord << "\n";
    }
    else if (vowel2.empty())
    {
        superWord += word1.front() + newWord1 + vowel1 + word2.front() + newWord2 + word2.back();
        cout << superWord << "\n";
    }

    /* Otra forma de iterar sobre la segunda palabra
    for (auto j = word2.rbegin(); j != word2.rend(); ++j) {
        if (*j == 'a' || *j == 'e' || *j == 'i' || *j == 'o' || *j == 'u')
        {   
            vowel2 = *j;
            break;
        }
    }*/

    return 0;
}