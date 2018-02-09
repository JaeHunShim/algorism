package algorism;
import java.util.Arrays;

class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
                int x =1;
                int y=1;
                int max = 1;
                int min= Math.min(a,b);
        for(int i=2; i<min; i++) {
                    if(a%i ==0 && b% i ==0) {
                        max = i;
                    }   
                }
        answer[0]=max;
                for(x =1; x <a; x++) {
                    if(max*x == a) {
                        System.out.println("x: "+x);
                        break;
                    }
                }
                for(y =1; y<b; y++) {
                    if(max*y==b) {
                        System.out.println("y: "+y);
                        break;
                    }
                }
        int min1=max*x*y;
        answer[1]=min1;
        return answer;

    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}