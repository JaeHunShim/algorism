package algorism.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


//배열안의 중복값 제거해서 출력 
public class OverapDelete {
	
	public int[] solution(int[] arr) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			array.add(arr[i]);
		}
		List<Integer> uniqueArray = new ArrayList<Integer>(new HashSet<Integer>(array));
		
		int answer[] = new int[uniqueArray.size()];
		System.out.println(answer.length);
		for(int i=0; i<uniqueArray.size(); i++) {
			answer[i] = uniqueArray.get(i);

		}
		return answer;
	}
	public static void main(String[] args) {
		
		int arr[] = {1, 1, 3, 3, 0, 1, 1};
		
		
		OverapDelete od = new OverapDelete();
		
		int answer[] = od.solution(arr);
		for(int i=0; i<answer.length; i++) {
		
			System.out.println(answer[i]);
		}
		
		
	}	
}
