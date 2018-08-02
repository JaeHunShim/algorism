package coding;

public class DemoArray {

	public static void main(String[] args) {
		
		String sentence ="I like java";
		
		String sentence1 = sentence.replaceAll(" ", "");
		
		char[] a =sentence1.toCharArray();
		
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i] =='a') {
				count = count+1;
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("The array letters includes " + count + "'a's");
	}
}
