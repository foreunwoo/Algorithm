import java.util.Scanner;

public class StudentNum2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n+1];

        for(int i=1; i<=n; i++) {
            int n2 = sc.nextInt();
            a[i] = n2;
        }

        for(int j = n; j >= 1; j--) {
            System.out.print(a[j] + " ");
        }

    }
}