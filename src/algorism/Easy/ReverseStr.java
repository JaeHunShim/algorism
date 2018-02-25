package algorism.Easy;

import java.util.Arrays;

public class ReverseStr {
	public String reverseStr(String str){
		char[] str1 = str.toCharArray();
		//str1을 정렬하고
		Arrays.sort(str1);
		//배열을 문자열로 바꾸고
		String str2 = String.valueOf(str1);
		//스트링 버퍼에 넣어서 reverse를 사용해서 역순으로 만들고
		StringBuffer buffer = new StringBuffer(str2);
		//버퍼를 스트링 타입으로 바꾸고
		String result = buffer.reverse().toString();
		
		return result;
		
		
		
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}