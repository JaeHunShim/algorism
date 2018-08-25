package algorism.Easy;
/*자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.*/

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
