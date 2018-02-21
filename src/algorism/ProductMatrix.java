package algorism;

/*행렬의 곱셈은, 곱하려는 두 행렬의 어떤 행과 열을 기준으로, 좌측의 행렬은 해당되는 행, 
우측의 행렬은 해당되는 열을 순서대로 곱한 값을 더한 값이 들어갑니다. 행렬을 곱하기 위해선 좌측 행렬의 열의 개수와 우측 행렬의 행의 개수가 같아야 합니다. 
곱할 수 있는 두 행렬 A,B가 주어질 때, 행렬을 곱한 값을 출력하는 productMatrix 함수를 완성해 보세요
*/
public class ProductMatrix {

	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4}};
		int[][] b = {{3,4},{5,6}};
		int[][] result= new int[a.length][a[0].length];
		try {
			for(int i=0; i<result.length;i++) {
				for(int j=0; j<result[0].length; j++) {
					for(int k=0;k<a[0].length;k++){
	                    result[i][j]+=a[i][k]*b[k][j];
	                }
				}
			}
		}catch(Exception e) {

		}
		System.out.println(result);
	}

}
