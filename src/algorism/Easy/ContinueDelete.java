package algorism.Easy;
/*배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때,
배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
배열 arr에서 제거 되고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.*/
public class ContinueDelete {
	
	public long solution(int a, int b) {
		
		long answer = 0;
		
		if(a<b) {
			for(int i=a; i<=b; i++) {
			 
			answer = answer+i;
			}
		}else {
			for(int i=b; i<=a; i++) {
				 
				answer = answer+i;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		
		ContinueDelete solution = new ContinueDelete();
		
		solution.solution(6, 8);
	}

}
