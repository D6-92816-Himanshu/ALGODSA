package Q3;

public class Tester {

	public static void main(String[] args) {
		String line = "word word is word not a word1 this is a word count 4";
		String[] arr = line.split(" ");
		int count=0;
		for(String s:arr) {
			if(s.equals("word")) {
				count++;
			}
		}
		System.out.println("Count of word is: "+ count);
			
	}

}
