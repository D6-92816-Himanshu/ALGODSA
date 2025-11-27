package Q3;


public class List {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}
	private Node head;
	public List() {
		head = null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(head == null) {
			head = newnode;
			newnode.next = newnode;
			newnode.prev = head;
		}
		else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
			head = newnode;
		}
	}
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(head == null) {
			head = newnode;
			newnode.next = newnode;
			newnode.prev = newnode;
		}
		else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
		}
	}
	public int deleteLast() {
		int temp = head.prev.data;
		if(head == null)return -1;
		else if(head.next==head) {
			head = null;
		}
		else {
			head.prev = head.prev.prev;
			head.prev.next = head;
		}
		return temp;
	}
	public int deleteFirst() {
		int temp = head.data;
		if(head==null)return -1;
		else if(head.next == head) {
			head = null;
		}
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
		return temp;
	}
	public int firstElement() {
		if(head==null)return -1;
		return head.data;
	}
	public int lastElement() {
		if(head==null)return -1;
		return head.prev.data;
	}

}
