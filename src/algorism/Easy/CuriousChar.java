package algorism.Easy;

public class CuriousChar {

	public static void main(String[] args) {
		
		String answer = "try hello world";
		
		String[] answer2 = answer.split(" ");
		
		for(int i=0; i<answer2.length; i++) {
			
			System.out.println(answer2[i]);
			
			answer2[i].toUpperCase();
		}
	}

}
