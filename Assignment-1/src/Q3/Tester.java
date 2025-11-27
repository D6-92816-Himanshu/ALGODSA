package Q3;

public class Tester {

	public static void main(String[] args) {

		SinglyCircularLinkedList l1 = new SinglyCircularLinkedList();
		l1.addFirst(0);
		l1.addFirst(1);
		l1.addFirst(100);
		l1.addFirst(90);
		l1.addFirst(3);
		l1.addFirst(5);
		l1.traverse();
	}

}
