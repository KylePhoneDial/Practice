#ifndef STACK_H
#define STACK_H

#include "node.h"

template <class T>
class queue {
	public:
		queue();
		void enqueue(T data);
		T dequeue();
		T peek();
		bool isEmpty();

	private:
		node<T> *head;
		node<T> *tail;
};

template <class T>
queue<T>::queue() {
	head = NULL;
	tail = NULL;
}

template <class T>
void queue<T>::enqueue(T data) {
	node<T> *newNode;
	newNode = new node<T>;

	newNode->data = data;
	newNode->next = NULL;

	if(head == NULL) {
		head = newNode;
		tail = newNode;
	}
	else {
		tail->next = newNode;
		tail = newNode;
	}

}

template <class T>
T queue<T>::dequeue() {
	node<T> *current = head;
	T data = current->data;

	head = head->next;
	delete current;

	return data;
}

template <class T>
T queue<T>::peek() {
	return head->data;
}

template <class T>
bool queue<T>::isEmpty() {
	return head == NULL;
}

#endif