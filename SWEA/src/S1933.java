import java.util.Scanner;

public class S1933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i=1; i<=10; i++) {
            if (n % i != 0) continue;
            System.out.print(String.format("%d ", i));
        }
    }
}
