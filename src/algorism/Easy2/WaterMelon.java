package algorism.Easy2;

public class WaterMelon {
	public String watermelon(int n){
		String result="";
		for(int i =1; i<=n; i++) {
			if(i % 2 == 0) {
				result = result +"박";
			}else {
				result = result+"수";
			}
		}
		return result;
	}

	// 실행을 위한 테스트코드입니다.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
		System.out.println("n이 11인경우: " + wm.watermelon(11));
	}
}