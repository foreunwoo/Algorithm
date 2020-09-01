import java.util.Scanner;

public class B11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 동전 종류
        int k = sc.nextInt(); // 액수

        int [] a = new int[n+1];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }


        int count = 0; // 화폐 갯수 세기
        int save = 0;

        for(int i=n-1; i>=0; i--) {
            if(k / a[i] >= 1) {
                count += k / a[i]; // 돈 카운트
                save = k / a[i];
                k -= save * a[i];

            }
        }

        System.out.println(count);
    }
}
