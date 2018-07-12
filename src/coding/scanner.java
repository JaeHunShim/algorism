	package coding;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "바보";
		Scanner sc = new Scanner(System.in);
		System.out.print("바보라고 입력해보세요 : ");
		String input = sc.next();
		if(str.equals(input)) {
		System.out.println("맞게 입력");
		} else {
		System.out.println("그거 아님");
		}
		sc.close();
	}

}
