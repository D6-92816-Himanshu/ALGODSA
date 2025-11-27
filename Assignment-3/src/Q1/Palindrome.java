package Q1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Palindrome {
	public static void main(String[] args) {
		String a = "ABBA";
		String b = "SIDDHARTH";
		char[] arr= a.toCharArray();

		//Method 1: TC-: O(N) SC-: O(N)
		System.out.println("Using temp array");
		int[] temp = new int[a.length()];
		for(int i=0;i<a.length();i++) {
			temp[temp.length-i-1]=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=temp[i]) {
				System.out.println("Not a palindrome");
				return;
			}
		}
		System.out.println("Palindrome");
		System.out.println();

		//Method 2:- TC:- O(N) SC:- O(N);
		System.out.println("Using deque");
		Deque<Character> dq = new ArrayDeque<>();
		for(char c: arr) {
			dq.offer(c);
		}
		while(!dq.isEmpty()) {
			if(dq.pollFirst()!=dq.pollLast()) {
				System.out.println("Not a palindrome");
				return;
			}
		}
		System.out.println("Palindrome");
		System.out.println();


//		Method 3: TC:- O(N) SC:-O(N)
		System.out.println("Using string functions");
		StringBuilder sb = new StringBuilder(a);
		if(!sb.reverse().toString().equals(a)) {
			System.out.println("Not a Palindrome");
			return;
		}
		System.out.println("Palindrome");
		System.out.println();

		//Method 4:- TC:- O(N) SC:- O(1)
		System.out.println("Using two pointers");
		int L = 0, R= arr.length-1;
		while(L<R) {
			if(arr[L]!=arr[R]) {
				System.out.println("Not a palindrome");
				return;
			}
			L++;
			R--;
		}
		System.out.println("Palindrome");
		System.out.println();
	}

}
