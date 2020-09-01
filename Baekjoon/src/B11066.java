import java.util.Scanner;

public class B11066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스 갯수

        int k; // 소설을 구성하는 장의 수
        int [] w; // 파일 크기
        int [] sum;
        int [][] dp;

        for(int test = 0; test < t; test++) {
            k = sc.nextInt();

            w = new int[k+1];
            sum = new int[k+1];
            dp = new int[500][500];

            for(int i=1; i <= k; i++) {
                w[i] = sc.nextInt();
                sum[i] = sum[i-1] + w[i];
            }

            for(int i=2; i <= k; i++) {

                for(int j= i-1; j > 0; j--) {
                    dp[j][i] = 9999999;

                    for(int s = j; s <= i; s++) {
                        dp[j][i] = Math.min(dp[j][i], dp[j][s] + dp[s+1][i]);
                    }

                    dp[j][i] += sum[i] - sum[j-1];
                }
            }
            System.out.println(dp[1][k]);
        }

        sc.close();
    }
}
