import java.util.*;

public class LinkedListTest {

	public static LinkedList linkedList;

	public static void main(String[] args) {
		
		linkedList = new LinkedList();

		linkedList.addFirst("0");
		linkedList.addAt("2", 1);
		linkedList.addAt("1", 1);
		linkedList.addFirst("12");
		linkedList.addLast("5");
		linkedList.addAt("10", 7);
		linkedList.addAt("3", 2);
		System.out.println(linkedList);

		linkedList.removeLast();
		System.out.println("\nRemove last: " + linkedList);

		linkedList.removeFirst();
		System.out.println("\nRemove first: " + linkedList);

		System.out.println("\nFirst: " + linkedList.getFirst());
		System.out.println("Pos 3: " + linkedList.getAt(3));
		System.out.println("Last: " + linkedList.getLast());

		linkedList.removeAt(3);
		System.out.println("\nRemove pos 3: " + linkedList);

	}
}