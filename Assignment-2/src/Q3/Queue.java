package Q3;

public class Queue {
private List list;

	public Queue() {
		list = new List();
	}
	public void push(int value) {
		list.addLast(value);
	}
	public int pop() {
		if(list.isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return list.deleteFirst();
	}
	public int peek() {
		return list.firstElement();
	}
}
