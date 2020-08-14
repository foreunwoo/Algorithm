import java.util.Scanner;

public class BadukGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[20][20];

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            a[x][y] = 1;
        }

        for(int i=1; i <= 19; i++) {
            for(int j=1; j <= 19; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
