package coding;

public class Test {

	public static void main(String[] args) {
		
		String word = "Seoul cityhall";
		
		System.out.println(st(word,1));

		System.out.println(st(word,2));

		System.out.println(st(word,3));

		System.out.println(st(word,4));

		System.out.println(st(word,5));

		System.out.println(st(word,6));
		
	}
	
	public static String st(String word,int number) {
		
		if(number == 1) {
			word = word.toLowerCase();
		}else if(number == 2){
			word = word.toUpperCase();
		}else if(number ==3) {
			word = word.toLowerCase() + "in jonggu";
		}else if(number == 4) {
			word = word.substring(3);
		}
			
		return word;
	}
}
