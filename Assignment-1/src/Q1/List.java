package Q1;


public class List {
	static class Node{
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

	public void insertAfter(int pos,int value) {
		Node newnode = new Node(value);
		if(head == null) {
			head = newnode;
		}
		else if(head.next==null) {
			head.next = newnode;
		}
		else {
		Node trav = head;
		for(int i=1;i<pos && trav!=null;i++) {
			trav = trav.next;
		}
		newnode.next = trav.next;
		trav.next = newnode;
		}
	}
	public void insertBefore(int pos,int value) {
		Node newnode = new Node(value);
		if(head == null) {
			head = newnode;
		}
		else if(head.next==null) {
			newnode.next = head;
			head = newnode;
		}
		else if(pos<=1) {
			newnode.next = head;
			head = newnode;
		}
		else {
		Node trav = head;
		for(int i=1;i<pos-2 && trav!=null;i++) {
			trav = trav.next;
		}
		newnode.next = trav.next;
		trav.next = newnode;
		}
	}
	public void display() {
		Node trav = head;
		if(head==null)return;
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav = trav.next;
		}

	}
}
