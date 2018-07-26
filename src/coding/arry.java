package coding;

import java.util.Random;

public class arry {

	public static void main(String[] args) {
		Random random = new Random();
		/*int[][] array = new int[4][4]; 
		int x = 0;
		int y= 0;
		for(int i=0; i<array.length; i++) {	
			for(int j=0; j<array[i].length; j++) {
				x = random.nextInt(4);
				y = random.nextInt(4);
				array[x][y] = random.nextInt(10)+1;
				System.out.printf("%-5s",array[i][j]);
			}
			System.out.println();
		}
			*/
		
		// 2. 2차원배열에 랜덤 위치에 랜덤 숫자로 만든걸 넣는다
		int[][] b = new int[4][4];
		int x=0;
		int y=0;
		for(int i=0; i<10; i++) {
			x = random.nextInt(4);
			y= random.nextInt(4);
			if(b[x][y] == 0) {
				b[x][y] = random.nextInt(10)+1;
			}
			else {
				i--;
			}
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				
				System.out.printf("%-5s",b[i][j]);
			}
			System.out.println();
		}
	
	}

}
