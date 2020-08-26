import java.util.Scanner;

public class B9461 {

    static int dp(int n) {
        int [] f = new int[n+1];

        for(int i=0; i<n; i++) {
            f[n] = 0;
        }

        if(n == 1 || n == 2 || n == 3) {
            f[n] = 1;
        } else if (f[n] == 0) {
            return f[n] = dp(n-3) + dp(n-2);
        }

        return f[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 테스트 케이스 갯수
        int [] t = new int[n];

        for(int i=0; i<n; i++) { // 경우의 수
            t[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) { // 경우의 수
            System.out.println(dp(t[i]));
        }
    }
}
