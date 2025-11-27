package Q3;

public class SinglyCircularLinkedList {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node tail;
	int size;
	public SinglyCircularLinkedList() {
		tail = null;
	}
	public boolean isEmpty() { //O(1)
		return tail == null;
	}
	public void traverse() { //O(n)
		if(tail == null) {
//			System.out.println("Returning");
			return;
		}
		Node trav = tail.next;
		do {
			System.out.println(trav.data);
			trav = trav.next;
		}
		while(trav!=tail.next);
	}
	
	public int size() { //O(1)
		return size;
	}
	
	
	public void addFirst(int data) { //O(n)
		Node newNode = new Node(data);
		if(tail == null) {
			newNode.next = newNode;
			tail = newNode;
		}
		+
		else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
		size++;
		
	}
	
	public void addLast(int data) {//O(n)
		Node newNode = new Node(data);
		if(tail == null) {
			tail = newNode;
			tail.next = tail;
		}
		
		else {
			Node trav = tail;
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
		size ++;
	}
	
	public void addPosition(int data,int position) {//O(n)
		if(position > size || position < 1) return;
		Node newNode = new Node(data);
		if(tail == null) {
			tail = newNode;
			tail.next = tail;
		}
		else {
			Node trav = tail;
			for(int i = 0;i<position - 1;i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
		size++;
	}
	
	public void deleteFirst() {//O(n)
		if(tail == null) return;
		else if(tail.next == tail) {
			tail = null;
		}
		else {
			tail.next = tail.next.next;
		}
		size--;
	}
	
	public void deleteLast() {//O(n)
		if(tail == null) return;
		else if(tail.next == tail) {
			tail = null;
		}
		else {
			Node trav = tail.next;
			while(trav.next!=tail) {
				trav = trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
		size--;
	}
	
	public void deletePosition(int position) {//O(n)
		if(position > size || position < 1 || tail == null) return;
		if(tail.next == null) {
			tail = null;
		}
		else if(position == 1) deleteFirst();
		else if(position == size) deleteLast();
		else	
		{
			Node trav = tail;
			for(int i = 0;i<position - 1;i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
		size --;
	}
}