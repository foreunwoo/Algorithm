import java.io.IOException;
import java.util.Scanner;

public class B11049 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [][] c = new int[n][2];
        int [][] dp = new int[n][n];

        for(int i=0; i<n; i++) {
            c[i][0] = sc.nextInt();
            c[i][1] = sc.nextInt();
        }

        for(int i=1; i<n; i++) {
            for(int j=0; j<n-i; j++) {
                dp[j][j+i] = Integer.MAX_VALUE;

                for(int k=0; k<i; k++) {
                    dp[j][j+i] = Math.min(dp[j][j+i], dp[j][j+k] + dp[j+k+1][j+i] + c[j][0] * c[j+k][1] * c[j+i][1]);
                }
            }
        }

        System.out.println(dp[0][n-1]);
        sc.close();
    }
}
