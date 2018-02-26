package algorism.Midium;

/*수학을 공부하던 민지는 재미있는 사실을 발견하였습니다. 그 사실은 바로 연속된 자연수의 합으로 어떤 숫자를 표현하는 방법이 여러 가지라는 것입니다. 예를 들어, 15를 표현하는 방법은
(1+2+3+4+5)
(4+5+6)
(7+8)
(15)
로 총 4가지가 존재합니다. 숫자를 입력받아 연속된 수로 표현하는 방법을 반환하는 expressions 함수를 만들어 민지를 도와주세요. 예를 들어 15가 입력된다면 4를 반환해 주면 됩니다.*/
public class Expression {

	public static void main(String[] args) {
		
		int a =15;
		int count =0;
		int sum =0;
		int j =0;
		//1. 절반을 넘어서면 그아음은 행렬의 연속되는 수로  덧셈으로 그수가 될수가 없다
		for(int i=1; i<=a/2; i++) {
			//2. 돌때마다 sum을 초기화 하기 위해서 
			sum=0;
			//3. 하나씩 j의 값을 늘리기 위해서 즉 0번째 했으면 그다음 1번째부터 연산하기 위해서 
			j=i;
			while(true) {
				//4 .j를 하나씩 증가시키면서 더하는데  a와 값이 같아지면 break나간후 다음 for문을 하게 함 
				sum = sum+j;
				j++;
				if(sum == a) {
					count =count+1;
					System.out.println(count);
					break;
				}else if(sum > a) {
					break;
				}
			}
		}
		//5. 마지막엔 자기자신을 포함해야되서 +1 해줌
		System.out.println(count+1);
	}
}
