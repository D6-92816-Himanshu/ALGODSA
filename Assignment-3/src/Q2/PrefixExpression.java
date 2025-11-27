package Q2;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrefixExpression {
	public static void main(String[] args) {
		String expression= "- + / * 45 63 53 91 70";
		int result =resultMaker(expression);
		System.out.println(result);

	}
	public static int exprMaker(int op1, int op2, String s) {
		switch(s) {
		case "+": return op1 + op2;
		case "-": return op1 - op2;
		case "*": return op1 * op2;
		case "/": return op1 / op2;
		case "%": return op1 % op2;
		case "$": return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	public static int resultMaker(String expr) {
		String[] arr = expr.split(" ");
		Deque<Integer> st = new ArrayDeque<>();
		int res=0;
		for(int i=arr.length-1;i>=0;i--) {
			if(Character.isDigit(arr[i].charAt(0))) {
				st.push(Integer.parseInt(arr[i]));
			}
			else {
				if(st.size()>=2) {
				int op1 = st.pop();
				int op2 = st.pop();
				res = exprMaker(op1,op2,arr[i]);
				st.push(res);
				}
			}
		}
		return res;
	}
}
