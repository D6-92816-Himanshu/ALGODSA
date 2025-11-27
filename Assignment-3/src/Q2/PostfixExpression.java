package Q2;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostfixExpression {
	public static void main(String[] args) {
		String expression= "45 63 * 53 / 91 + 70 -";
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
		for(String s: arr) {
			if(Character.isDigit(s.charAt(0))) {
				st.push(Integer.parseInt(s));
			}
			else {
				if(st.size()>=2) {
				int op2 = st.pop();
				int op1 = st.pop();
				res = exprMaker(op1,op2,s);
				st.push(res);
				}
			}
		}
		return res;
	}
}
