#include <iostream>
#include <climits>
#include "stack.h"

using namespace std;

Stack::Stack() {
	size = 0;
	structure = new ItemType[max_items];
}

Stack::~Stack() {
	delete [] structure;
}

bool Stack::isFull() {
	return (length() == max_items);
}

bool Stack::isEmpty() {
	return (length() == 0);
}

void Stack::push(ItemType item) {
	if (isFull()) {
		cout << "cannot insert on a full list" << endl;
	} else {
		structure[size] = item;
		size++;
	}
}

ItemType Stack::pop() {
	if (isEmpty()) {
		cout << "cannot remove from an empty list" << endl;
		cout << "the stack doesn't have items to be removed" << endl;
		return 0;
	} else {
		size--;
		return structure[size];
	}
}

void Stack::print() {
	cout << "Stack: [ ";
	for (unsigned int i = 0; i < size; i++) {
		cout << structure[i] << ", ";
	}
	cout << "]" << endl;
}

int Stack::length() {
	return size;
}

ItemType Stack::peek() {
	if (isEmpty()) {
		cout << "cannot peek from an empty stack" << endl;
		return -1;
	} else {
		return structure[0];
	}
}
