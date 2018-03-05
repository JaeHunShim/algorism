package algorism.Midium;

import java.util.Arrays;

public class Square {

	public static void main(String[] args) {
		char [][]board ={
				{'X','O','O','O','X'},
				{'X','O','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','X','X','X'}};
		
		//1. 문자배열을 1,0의 배열로 바꾼다.
		int[][] result = new int[board.length][board[0].length];
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				if(board[i][j] == 'O') {
					result[i][j] =1;
				}else {
					result[i][j] =0;
				}
			}
		}
		int result1 = 0;
		for(int i=1; i<result.length; i++) {
			for(int j=1; j<result[0].length;j++) {
				//2. 해당 배열의 데이터가 0이면 계속해서 1을 찾아
				if(result[i][j] == 0) {
					continue;
				//3. 대각선 왼쪽 오른쪽 왼쪽이 1일경우에 해당 값에 +1 을 해준다.
				}else if(result[i-1][j] >= 1 && result[i][j-1] >= 1 && result[i-1][j-1] >= 1) {
					result[i][j] = Math.min(Math.min(result[i-1][j], result[i][j-1]), result[i-1][j-1])+1;
				}
				result1 = Math.max(result1, result[i][j]);
			}
		}
		System.out.println(result1*result1);
	}

}
