#include <iostream>
#include "stack.h"

using namespace std;

int main() {
	Stack stack1;

	ItemType element;

	int option;

	cout << "Stack generative program:" << endl;

	do {
		cout << "Type 0 to stop the program!" << endl;
		cout << "Type 1 to insert an element!" << endl;
		cout << "Type 2 to remove an element!" << endl;
		cout << "Type 3 to print the stack!" << endl;
		cout << "Type 4 to peek the stack!" << endl;
		cout << "Option: ";
		cin >> option;

		if (option == 1) {
			cout << "Type the element to be inserted: ";
			cin >> element;
			stack1.push(element);
		} else if (option == 2) {
			element = stack1.pop();
			cout << "Removed element: " << element << endl;
		} else if (option == 3) {
			stack1.print();
		} else if (option == 4) {
			element = stack1.peek();

			cout << "Peek element: " << element << endl;
		}
	} while (option != 0); 
	
	return 0;
}
