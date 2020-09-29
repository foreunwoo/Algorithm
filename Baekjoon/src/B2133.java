import java.util.Scanner;

public class B2133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] dp = new int[n+1];

        dp[0] = 1;
        dp[2] = 3;

        for(int i=4; i<=n; i++) {
            dp[i] = dp[i-2] * 3;

            for(int j=4; j<=i; j+=2) {
                dp[i] += dp[i - j] * 2;
            }
        }

        System.out.println(dp[n]);
        sc.close();
    }
}
