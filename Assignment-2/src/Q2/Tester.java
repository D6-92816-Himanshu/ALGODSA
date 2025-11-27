package Q2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		CircularQueue q = new CircularQueue(4);

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch(choice) {
			case 1:
				System.out.print("Enter data to push : ");
				int data = sc.nextInt();
				q.push(data);
				break;
			case 2:
				System.out.println("Poped data : " + q.pop());
				break;
			case 3:
				System.out.println("Peeked data : " + q.peek());
				break;
			}

		}while(choice != 0);


		sc.close();

	}

}
