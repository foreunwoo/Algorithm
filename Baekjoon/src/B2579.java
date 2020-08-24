import java.util.Scanner;

public class B2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 계단의 수

        int [] s = new int[n+1]; // 계단 점수
        int [] dp = new int[n+1]; // 점수 저장
        int max = 0; // 최댓값

        for(int i=0; i<n; i++) {
            s[i] = sc.nextInt();
        }

        dp[0] = s[0];

        for(int i=1; i<n; i++) {
            if(i % 2 == 1) {
                dp[i + 1] = dp[i - 1] + Math.max(s[i], s[i + 1]);
            }

            max = Math.max(max, dp[i+1]);
        }

        System.out.println(max);
    }
}
