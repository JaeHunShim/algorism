package algorism.Easy;
/*문자열 s의 길이가 4혹은 6이고, 숫자로만 구성되있는지 확인해주는 함수, solution을 완성하세요.
예를들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.*/
public class StringDefault {
	
	public boolean solution(String s) {
		boolean answer = true;
		int array[] = new int[s.length()];
		for(int i=0; i<array.length; i++) {
			array[i] = s.charAt(i);
			if(array[i]>47 && array[i]<58) {
				if(s.length()==4 || s.length()==6) {
					answer=true;
				}else {
					answer = false;
					break;
				}
			}else {
				answer= false;
				break;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		
		String s = "1.2e-3";
		StringDefault result = new StringDefault();
		System.out.println(result.solution(s));
	}
}
