package coding;

public class Print {
	public static String PrimeN(int n)
	 {
	  String fnt;
	  if(n % 2 ==0){
		  fnt="false";
	  }else{
	   fnt="true";
	  }
	  return fnt;
	 }

	public static void main(String[] args) {
		
		PrimeN(5);
		  
	}

}
