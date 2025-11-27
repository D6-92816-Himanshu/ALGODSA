package Q2;

public class CircularQueue {
	private int[] arr;
	private int front;
	private int rear;
	private final int SIZE;
	public CircularQueue(int size) {
		SIZE=size;
		arr = new int[SIZE];
		front = rear = -1;
	}

	public void push(int value) {
		arr[++rear%SIZE]=value;
	}
	public int pop() {
		int temp  = -1;
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			temp = arr[(front+1)%SIZE];
			front = (front+1)%SIZE;
			if(front==rear)
				front=rear = -1;
		}
		return temp;
	}
	public int peek() {
		int temp =-1;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			temp= arr[(front+1)%SIZE];
		}
		return temp;
	}

	public boolean isEmpty() {
		return front == rear && rear ==-1;
	}

	public boolean isFull() {
		return (front==-1 && rear ==SIZE -1) || (front==rear && rear != -1);
	}
}
