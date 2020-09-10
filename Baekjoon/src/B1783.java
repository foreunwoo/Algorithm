import java.util.Scanner;

public class B1783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 세로
        int M = sc.nextInt(); // 가로
        int ans = 0; // 최대 갈 수 있는 칸

        if(N == 1) {
            ans = 1;
        } else if(N == 2) {
            ans = Math.min((M + 1)/2, 4);
        } else if(M < 7) {
            ans = Math.min(M, 4);
        } else {
            ans = M - 7 + 5;
        }

        System.out.println(ans);
    }
}
