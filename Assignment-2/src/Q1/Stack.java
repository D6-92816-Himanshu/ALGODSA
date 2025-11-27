package Q1;

public class Stack {
	private int[] arr;
	private int top;
	private final int SIZE;
	public Stack(int size) {
		// TODO Auto-generated constructor stub
		SIZE=size;
		arr = new int[SIZE];
		top=-1;
	}
	public void push(int data) {
		if(isFull())
			System.out.println("Stack is full");
		else
		arr[++top]=data;
	}
	public boolean isFull() {
		return top==SIZE-1;
	}
	public int pop() {
		if(isEmpty())
			System.out.println("Stack is empty");
		return arr[top--];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public int peek() {
		if(isEmpty())
			System.out.println("Stack is empty");
		return arr[top];
	}

}
