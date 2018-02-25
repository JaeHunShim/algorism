package algorism.Easy2;

/*reverseInt 메소드는 int형 n을 매개변수로 입력받습니다.
n에 나타나는 숫자를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다.
n은 양의 정수입니다.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseInt {
	public int reverseInt(int num){
		//1. num 을  문자열로 만들고
		String sNum = String.valueOf(num);
		System.out.println(sNum);
		//2. 문자열을 배열로 만들고 
		String[] arrayNum = sNum.split("");
		//3. 문자열 배열을 다시 정수형 배열로 만들고
		int[] iNum = new int[arrayNum.length];
		for(int i=0; i<iNum.length; i++) {
			iNum[i] = Integer.parseInt(arrayNum[i]);
		}
		//4. 배열을 정렬하고
		Arrays.sort(iNum);
		//5. 정렬한 배열을 list에 담아서 
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<iNum.length; i++) {
			list.add(iNum[i]);
			System.out.println(list);
		}
		//6. reverse로 내림차순으로 바꾼다
		Collections.reverse(list);
		
		//7. list를 다시 int형 배열로 바꾸고
		int[]ret = new int[list.size()];
		for(int i =0; i<ret.length; i++) {
			ret[i] = list.get(i).intValue();
			System.out.println(Arrays.toString(ret));
		}
		//8.  int형 배열을 다시 문자열로 바꾼후
		String result ="";
		 for(int i =0; i<ret.length;i++) {
			 result = result+ret[i];
		 }
		 // 9. 문자열을 int형으로 바꾸고 끝
		 int intResult = Integer.parseInt(result);
    	return intResult;
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}