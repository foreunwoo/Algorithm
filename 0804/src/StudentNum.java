import java.util.Arrays;
import java.util.Scanner;

public class StudentNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int [24];
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            int n2 = sc.nextInt();
            a[n2] += 1;
        }

        for(int j = 1; j<=23; j++) {
            System.out.print(a[j] + "");
        }

    }
}
