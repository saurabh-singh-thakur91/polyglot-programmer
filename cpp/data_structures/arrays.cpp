#include <iostream>
using namespace std;

int main()
{
    int numbers[5];
    string names[5];

    numbers[0] = 1;
    cout << numbers[0] << endl;
    cout << numbers[1] << endl; // This will print garbage value

    cout << sizeof(names) / sizeof(names[0]) << endl; // This will print the size of the array
}