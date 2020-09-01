import java.util.Scanner;

public class B11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수열 A의 크기

        int [] a = new int[n+1];
        int [] dp = new int[n+1];
        int max = 0;

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        dp[0] = 1;

        for(int i=1; i<n; i++) {
            dp[i] = 1;

            for(int j=0; j<i; j++) {
                if(a[i] > a[j] && dp[j] >= dp[i]) {
                    dp[i] = dp[j]+1;
                }
            }

            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
