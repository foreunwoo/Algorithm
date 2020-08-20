import java.util.Scanner;

public class B2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 포도주잔 갯수

        int [] a = new int[n+1];
        int [] dp = new int[n+1]; // 포도주 양 저장
        int max = 0; // 최댓값

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        dp[0] = a[0];

        for(int i=1; i<n/2; i++) {
            dp[i] = (a[i-1] + a[i]) + (a[i+2] + a[i+3]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}
