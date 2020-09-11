import java.util.Arrays;
import java.util.Scanner;

public class B2437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] w = new int[n];

        for(int i=0; i<n; i++) {
            w[i] = sc.nextInt();
        }

        Arrays.sort(w);

        int sum = 0;
        for(int i=0; i<n; i++) {
            if(sum + 1 < w[i]) {
                break;
            }

            sum += w[i];
        }

        System.out.println(sum + 1);

    }
}
