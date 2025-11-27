package Q1;

public class Tester {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7};
		Stack st = new Stack(arr.length);
		for(int i=0;i<arr.length;i++) {
			st.push(arr[i]);
		}

		for(int i=0;i<arr.length;i++) {
			arr[i]=st.pop();
			System.out.print(arr[i]+" " );
		}
	}
}
