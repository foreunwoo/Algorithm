import java.util.Scanner;

public class B11049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [][] c = new int[n+1][2];
        int [][] dp = new int[n+1][n+1];
        int [] p = new int[n+1];

        for(int i=1; i<=n; i++) {
            c[i][0] = sc.nextInt();
            c[i][1] = sc.nextInt();

            p[i] = c[i][1];
        }

        p[0] = c[1][0];

        for(int i=2; i<=n; i++) {
            for(int j=i-1; j > 0; j--) {
                dp[j][i] = 99999999;

                for(int k=j; k <= i; k++) {
                    dp[j][i] = Math.min(dp[j][i], c[j][k] + c[k+1][i] + (p[j-1] * p[k] * p[i]));
                }
            }
        }

        for(int i=0; i<n; i++) {
            System.out.println(p[i]);
        }
    }
}
