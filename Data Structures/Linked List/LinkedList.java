import java.util.*;

public class LinkedList<T> {

	private Node<T> head;

	public LinkedList() {
		
		head = null;
	}

	/*
		Inserts a new node at the head of the list.
	*/
	public void addFirst(T data) {

		head = new Node<T>(data, head);
	}

	/*
		Returns the first element
	*/
	public T getFirst() {

		if(head == null)
			throw new NoSuchElementException();

		return head.getData();
	}

	/*
		Removes the first element
	*/
	public boolean removeFirst() {

		if(head == null) 
			throw new NoSuchElementException();

		head = head.getNext();
		return true;
	}

	/*
		Adds an element to the end of the list
	*/
	public void addLast(T data) {

		if(head == null) 
			addFirst(data);
		else {
			Node<T> temp = head;
			while(temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(new Node<T>(data));
		}
	}

	/*
		Gets the element at the end of the list
	*/
	public T getLast() {

		Node<T> temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}

		return temp.getData();
	}

	/*
		Removes the last element in our list
	*/
	public boolean removeLast() {
		if(head == null)
			return false;

		Node<T> temp = head;
		while(temp.getNext().getNext() != null) {
			temp = temp.getNext();	
		}

		temp.setNext(null);
		return true;
	}

	/*
		Adds an element at the specified index or at the end of the list
	*/
	public void addAt(T data, int index) {

		Node<T> temp = head;

		if(temp != null) {
			for (int i = 0; (i < index - 1) && temp.getNext() != null; i++) {
				temp = temp.getNext();
			}
		}

		temp.setNext(new Node<T>(data, temp.getNext()));
	}

	/*
		Gets the element at the specified index
	*/
	public T getAt(int index) {
		
		Node<T> temp = head;

		if(head != null) {
			for(int i = 0; i < index && temp.getNext() != null; i++) {
				if (temp.getNext() == null)
					throw new NoSuchElementException();

				temp = temp.getNext();
			}
		}

		return temp.getData();
	}

	/*
		Removes the element at the specified index
		Returns false of index is out of bounds or head is null
		Returns true if sucessfully removed
	*/
	public boolean removeAt(int index) {
		
		Node<T> temp = head;

		if(head!= null) {
			for(int i = 0; (i < index - 1) && temp.getNext() != null; i++) {
				if (temp.getNext() == null)
					return false;

				temp = temp.getNext();
			}

		temp.setNext(temp.getNext().getNext());
		return true;
		}
		
		return false;
	}

	public String toString() {

		String output = "";

		if (head != null) {
			Node temp = head;

			while(temp != null) {
				output += "[" + temp.getData() + "]";
				temp = temp.getNext();
			}
		}

		return output;
	}
}