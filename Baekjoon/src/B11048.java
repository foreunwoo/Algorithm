import java.util.Scanner;

public class B11048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int [][] a = new int[N+1][M+1];
        int [][] dp = new int[N+1][M+1];

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=M; j++) {
                a[i][j] = sc.nextInt();
                dp[i][j] = Math.max(Math.max(dp[i-1][j-1], dp[i][j-1]), dp[i-1][j]) + a[i][j];
            }
        }

        System.out.println(dp[N][M]);
    }
}
