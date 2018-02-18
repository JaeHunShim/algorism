package algorism;


public class ex{
	public boolean isHarshad(int num){

		String sNum = Integer.toString(num);
		String[] array = sNum.split("");
		int[] inArray = new int[array.length];
		for(int i =0; i<array.length; i++) {
			inArray[i] = Integer.parseInt(array[i]);
		}
		int sum =0;
		for(int i= 0; i<inArray.length; i++) {
			sum = sum + inArray[i];
		}
		if(num%sum ==0) {
			return true;
		}else {
			return false;
		}	
	}
  
       // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ex sn = new ex();
		System.out.println(sn.isHarshad(18));
	}
}