package algorism.Easy;

import java.util.Arrays;

/*프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.*/
public class phone {
	
	public String solution(String phone_number) {
		char[] array = new char[phone_number.length()];
		char[] a = new char[array.length];
		for(int i=0; i<array.length; i++) {
			if(i>=phone_number.length()-4) {
				a[i] = '*';
			}else {
				a[i]=phone_number.charAt(i);
			}
		}
		String result = String.valueOf(a);
		
		return result;
		
	}
	public static void main(String[] args) {
		
		String phone_number ="111222333445664";
		phone result = new phone();
		System.out.println(result.solution(phone_number));
		
		
	}

}
