#include <iostream>
#include "stack.h"

int main(int argc, char const *argv[])
{
	stack<int> stack;

	stack.push(11);
	std::cout << stack.peek() << std::endl;

	return 0;
}