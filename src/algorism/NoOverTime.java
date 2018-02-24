package algorism;
/*야근 지수
회사원인 수민이는 많은 일이 쌓여 있습니다. 수민이는 야근을 최소화하기 위해 남은 일의 작업량을 숫자로 메기고, 일에 대한 야근 지수를 줄이기로 결정했습니다. 
야근 지수는 남은 일의 작업량을 제곱하여 더한 값을 의미합니다. 
수민이는 1시간 동안 남은 일 중 하나를 골라 작업량 1만큼 처리할 수 있습니다. 
수민이의 퇴근까지 남은 N 시간과 각 일에 대한 작업량이 있을 때, noOvertime 함수를 제작하여 수민이의 야근 지수를 최소화 한 결과를 출력해 주세요.
예를 들어, N=4 일 때, 남은 일의 작업량이 [4, 3, 3] 이라면 야근 지수를 최소화하기 위해 일을 한 결과는 
[2, 2, 2]가 되고 야근 지수는 22 + 22 + 22 = 12가 되어 12를 반환해 줍니다.*/
//핵심은  배열의 최대값에서 -1씩 계속 해주는 것인듯 하다. 반복횟수는 남은 시간만큼만 해주면 되겠지(당연한거징)
import java.util.Arrays;

class NoOverTime {
	public int noOvertime(int num, int[] test) {
		int max = 0;
		int num1 = 0;
		int result =0;
		System.out.println(max);
		// 1. 남은 시간만큼 반복
		for(int i =0; i<num; i++) {
			//2. 배열의 최대값을 찾고 최대값의 index 위치를 변수 num1에 담아놓는다 
			for (int j =0; j<test.length; j++) {
				if(max <=test[j]) {
					max = test[j];
					num1 = j;
					System.out.println(test[j]);
				}
			}
			max =0;
			//3 최대값이 있는 해당 index 값에서 -1을 해준다. 
			test[num1] = test[num1]-1;
		}
		System.out.println(Arrays.toString(test));
		//4. 해당 배열의 값을 제곱해서 result에 계속 담아주면 끝
		for(int i =0; i<test.length; i++) {
			result = result+(test[i]* test[i]);
		}
		System.out.println(result);

		return result;
	}
	public static void main(String[] args) {
		NoOverTime c = new NoOverTime();
		int []test = {4,3,3};
		System.out.println(c.noOvertime(4,test));
	}
}

