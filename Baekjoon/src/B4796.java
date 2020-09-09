import java.util.Scanner;

public class B4796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = 0; // 이용 가능한 일수
        int p = 0; // 연속하는 일수
        int v = 0; // 휴가 수
        int t = 1;

        while(true) {
            l = sc.nextInt();
            p = sc.nextInt();
            v = sc.nextInt();

            if(l == 0) break;

            int a = v / p;
            int days = a*l;
            days += v % p;

            System.out.println("Case "+t+": "+days);
            t++;
        }
    }
}
