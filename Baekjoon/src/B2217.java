import java.util.*;

public class B2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 로프 갯수
        int [] k = new int[n]; // 로프의 중량
        int max = 0;

        for(int i=0; i<n; i++) {
            k[i] = sc.nextInt();
        }

        Arrays.sort(k);

        for(int i = n-1; i >= 0; i--) {
            k[i] = k[i] * (n-i);
            max = Math.max(max, k[i]);

        }

        System.out.println(max);
    }
}
