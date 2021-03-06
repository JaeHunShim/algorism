package algorism.Midium;
/*두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 
예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
nlcm 함수를 통해 n개의 숫자가 입력되었을 때, 최소공배수를 반환해 주세요. 예를들어 [2,6,8,14] 가 입력된다면 168을 반환해 주면 됩니다.*/
class LeastCommonMultiple {
	public int gcd(int a, int b) {
		int temp;
		while(b !=0) {
			temp = a;
			a = b;
			b = temp %b;
		}
		return a;
	}
	 public int gcd(int[] array) {
		  int result;
		  
		  if(array.length <= 1)
		   return array[0];
		  
		  result = gcd(array[0], array[1]);
		  for(int i = 2; i < array.length; ++i)
		   result = gcd(result, array[i]);
		  
		  return result;
	}

	//최소공배수
	public int lcm(int[] array) {
		
		 int gcd = gcd(array);
		 int lcm = gcd;
		 for(int i = 0; i < array.length; ++i) {
		   array[i] /= gcd;
		   lcm *= array[i];
		  }
		  
		  return lcm; 
	}

	public static void main(String[] args) {
		LeastCommonMultiple c = new LeastCommonMultiple();
		int[] ex = { 2, 6, 8, 14 };
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.lcm(ex));
	}
}