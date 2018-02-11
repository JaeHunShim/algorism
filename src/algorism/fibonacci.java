package algorism;

class Fibonacci {
	public long fibonacci(int num) {
		long answer = 1;
		long pre =0;
		long temp;
		for(int i =1; i<num; i++) {
			temp = pre;
			pre = answer;
			answer += temp;
		
		}
		return answer;
	}

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}
