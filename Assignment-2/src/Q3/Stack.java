package Q3;

public class Stack {
	private List list;

public Stack() {
	list = new List();
}
	public void push(int value) {
		list.addFirst(value);
	}
	public int pop() {
		if(list.isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return list.deleteFirst();
	}
	public int peek() {
		return list.firstElement();
	}
}
