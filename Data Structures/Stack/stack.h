#ifndef STACK_H
#define STACK_H
#include "node.h"

template <class T>
class stack {
	public:
		stack();
		T pop();
		void push(T data);
		bool isEmpty();

	private:
		node<T> *first;
};

template <class T>
stack<T>::stack() {
	first = NULL;
}

template <class T>
T stack<T>::pop() {
	node<T> * current = first;
	T data = current->data;

	first = first->next;
	delete current;

	return data;
}

template <class T>
void stack<T>::push(T data) {
	node<T> *newNode;
	newNode = new node<T>;

	newNode->data = data;
	newNode->next = first;
	first = newNode;
}

template <class T>
bool stack<T>::isEmpty() {
	return first == NULL;
}

#endif