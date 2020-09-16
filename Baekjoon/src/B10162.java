import java.io.IOException;
import java.util.Scanner;

public class B10162 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 시간

        int a = 0; // 300초
        int b = 0; // 60초
        int c = 0; // 10초

        while(t != 0) {
            if(t >= 300) {
                a += t / 300;
                t %= 300;

            } else if(t >= 60) {
                b += t / 60;
                t %= 60;

            } else if(t >= 10) {
                c += t / 10;
                t %= 10;

            } else {
                System.out.println(-1);
                break;
            }

        }
        System.out.println(a + " " + b + " " + c);

        sc.close();
    }
}
