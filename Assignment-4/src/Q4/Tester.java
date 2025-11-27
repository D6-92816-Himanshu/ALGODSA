package Q4;


public class Tester {

	public static void main(String[] args) {
		int[] arr = {0,0,0,0,0,1,1,1,1,2,2,2};
		int[] freq = new int[9];
		int count=0;
		int mode=-1;
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>count) {
				count=freq[i];
				mode =i;
			}
		}
		
		System.out.println("Mode: "+mode);
	}

}
