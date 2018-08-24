package algorism.Easy;

public class FlipNaturalNumber {
	
	public int[] solution(long n) {
		
		String a = String.valueOf(n);
		
		String array[] = a.split("");
		int result1[] = new int[array.length];
		int count1=1;
		for(int i=0; i<array.length; i++) {
			result1[i] = Integer.valueOf(array[array.length-count1]);
			count1++;
		}
		return result1;
	}
	public static void main(String[] args) {
		
		FlipNaturalNumber fnn = new FlipNaturalNumber();
		long n = 2938475;
		
		System.out.println(fnn.solution(n));
		
		
		
		
	}
}
