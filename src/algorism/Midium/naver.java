package algorism.Midium;

public class naver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num = 1;
			
				while(num < 10) {
				    if(num % 2 == 1) {
				       num += 1;
				       continue;
				       
				    }
				    System.out.println(num);
				}
				    num+=1;
				    

				/*int num2 = 1;
						while( num2 < 10) {
						    if(num2 % 2 == 1) {
						       num2 += 1;
						    }		   
						   
						    num2+=1;
						    System.out.println(num2);
						}   */
				/*이게 정답이고요 전 막

				num = 1
				while num < 10:
				    if num % 2 == 1:
				       num += 1
				    print(num)
				    num+=1

				이렇게도 해보고

				num = 1
				while num < 10:
				    if num % 2 == 1:
				       num += 1
				       continue

				    num+=1
				    print(num)이렇게도 해봤는데*/
	}

}
