package Q3;

public class Tester {
	public static void main(String[] args) {
		System.out.println("Stack::");
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println("Peek: "+st.peek());
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println("Pop: "+st.pop());
		System.out.println();

		System.out.println("Queue::");
		Queue q = new Queue();
		q.push(100);
		q.push(200);
		q.push(300);
		q.push(400);
		q.push(500);
		q.push(600);
		System.out.println("Peek: "+q.peek());
		q.pop();
		q.pop();
		q.pop();
		System.out.println("Pop: "+q.pop());
		System.out.println("Peek: "+q.peek());
	}
}
