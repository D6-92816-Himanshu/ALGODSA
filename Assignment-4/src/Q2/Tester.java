package Q2;

public class Tester {

	public static void main(String[] args) {
		int[] arr = {0,1,2,2,3,2,1,2,5,2,1,0};
		int key =2;
		int n=3;
		System.out.println(nOccurence(key, arr, n));

	}
	public static int nOccurence(int key, int[] arr,int n) {
		n--;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key && n==0)return i;
			else if(arr[i]==key)n--;
		}
		return -1;
	}

}
