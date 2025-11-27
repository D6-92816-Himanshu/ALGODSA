package Q2;



public class List {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			this.next = null;
		}
	}

	private Node head;

	public List() {
		head = null;
	}

	public void insertSorted(int value) {
		Node newnode = new Node(value);
		if(head==null) {
			head=newnode;
			return;
		}
		if(value<head.data) {
			newnode.next = head;
			head = newnode;
			return;
		}
		Node trav = head;
		while(trav.next!=null && trav.next.data<value) {
			trav=trav.next;
		}
//		if(trav.next.data<value) {
//			trav.next = newnode;
//		}

		newnode.next=trav.next;
		trav.next = newnode;


	}

	public void display() {
		Node trav = head;
		if (head == null)
			return;
		while (trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}

	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}

}