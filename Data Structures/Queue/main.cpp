#include <iostream>
#include "queue.h"

int main(int argc, char const *argv[])
{
	queue<int> queue;

	queue.enqueue(11);
	queue.enqueue(12);
	queue.enqueue(13);

	std::cout << queue.isEmpty() << std::endl;
	std::cout << queue.dequeue() << std::endl;
	std::cout << queue.isEmpty() << std::endl;
	std::cout << queue.dequeue() << std::endl;
	std::cout << queue.dequeue() << std::endl;
	std::cout << std::endl;
	std::cout << queue.isEmpty() << std::endl;
	return 0;
}