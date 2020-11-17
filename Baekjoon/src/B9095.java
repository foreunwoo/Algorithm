import java.util.Scanner;

public class B9095 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        int[] dp;
        int n;

        while (!(test == 0)) {
            n = sc.nextInt();
            dp = new int[n+1];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int i = 4; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }

            System.out.println(dp[n]);
            test--;
        }

    }
}
