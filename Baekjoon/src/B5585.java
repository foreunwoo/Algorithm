import java.io.IOException;
import java.util.Scanner;

public class B5585 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 지불해야 하는 금액
        if(n < 1 || n > 1000) {
            throw new IOException();
        }

        int cash = 1000-n; // 거스름돈
        int [] a = {500, 100, 50, 10, 5, 1};

        int count = 0;

        for(int i=0; i<a.length; i++) {
            if(cash / a[i] >= 1) {
                count += cash / a[i];
                cash = cash % a[i];
            }
        }

        System.out.println(count);
    }
}
