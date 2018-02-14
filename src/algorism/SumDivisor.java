package algorism;

public class SumDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12;
		int sum =0;
		
		for(int i =number; i >0; i--) {
			if(number % i == 0) {
				System.out.println(number/i);
				sum = sum+(number/i);
				System.out.println(sum);
			}
		}
		
	}

}
