import java.util.Scanner;

public class B2579_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] a = new int[n+1];
        int [] dp = new int[n+1];
        int max = 0;

        dp[0] = a[0];
        for (int i=1; i<=n; i++) {
            if (i % 2 == 1) {
                dp[i+1] = dp[i-1] + Math.max(a[i], a[i+1]);
            }

            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
