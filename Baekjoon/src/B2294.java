import java.util.Scanner;

public class B2294 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] w = new int[n+1];
        int [] dp = new int[k+1];

        for(int i=1; i<=n; i++) w[i] = sc.nextInt();

        for(int j=1; j<=k; j++) dp[j] = 100001;

        dp[0] = 0;
        for(int i=1; i<=n; i++) {
            for(int j=w[i]; j<=k; j++) {
                dp[j] = Math.min(dp[j], dp[j - w[i]] + 1);
            }
        }

        if(dp[k] == 100001) System.out.println(-1);
        else System.out.println(dp[k]);
    }
}
