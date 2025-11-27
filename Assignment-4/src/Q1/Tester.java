package Q1;

public class Tester {

	public static void main(String[] args) {
		int key = 2;
		int[] arr = {0,1,2,3,4,3,2,1,0};
		System.out.println(lastOccurence(arr, key));

	}
	public static int lastOccurence(int[] arr, int key) {
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==key)return i;
		}
		return -1;
	}

}
