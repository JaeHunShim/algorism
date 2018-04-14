package algorism.Easy;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,k,l, result;
		j=1;
		k=2;
		l=3;
		
		for(int i=0; i<5; i++) {
			if(l<k) {
				result =k++;
				System.out.println(result);
			}else {
				result= --l;
				System.out.println(result);
			}
		}
	}
}
