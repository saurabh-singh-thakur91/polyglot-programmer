#include <iostream>
#include <vector>
using namespace std;

int main()
{
    vector<int> numbers(5);  // Create a vector of size 5
    vector<string> names(5); // Create a vector of size 5

    numbers[0] = 1;
    cout << numbers[0] << endl;
    cout << numbers[1] << endl; // This will print garbage value

    cout << names.size() << endl;     // This will print the size of the vector
    cout << names.capacity() << endl; // This will print the capacity of the vector
    cout << names.max_size() << endl; // This will print the maximum size of the vector

    numbers.emplace_back(2); // Add an element to the end of the vector
    numbers.push_back(3);    // Add an element to the end of the vector

    // push_back() vs emplace_back()
    // push_back() creates a copy of the object and then adds it to the vector
    // emplace_back() creates the object in place and then adds it to the vector
    // emplace_back() is more efficient than push_back() because it avoids the copy
    // emplace_back() is only available in C++11 and later
}