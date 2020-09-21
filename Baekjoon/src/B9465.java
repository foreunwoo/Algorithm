import java.util.Scanner;

public class B9465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int n;
        int [][] dp = new int[2][10007];
        dp[0][0] = 0;

        for(int test=0; test<t; test++) {
            n = sc.nextInt();

            for(int i=0; i<2; i++) {
                for(int j=2; j<n+2; j++) {
                    dp[i][j] = sc.nextInt();
                }
            }

            for(int j=2; j<n+2; j++) {
                for(int i=0; i<2; i++) {
                    if(i == 1) {
                        dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j-2]);
                    } else {
                        dp[i][j] += Math.max(dp[i+1][j-1], dp[i+1][j-2]);
                    }
                }
            }

            System.out.println(Math.max(dp[0][n+1], dp[1][n+1]));
        }

        sc.close();
    }
}
