import java.util.Arrays;
import java.util.Scanner;

public class B11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 사람 수

        int [] a = new int[n];
        int [] dp = new int[n]; // 저장할 배열

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        dp[0] = a[0];
        int time = dp[0];

        for(int i=1; i<n; i++) {
            dp[i] = dp[i-1] + a[i];
            time += dp[i];
        }

        System.out.println(time);
    }
}
