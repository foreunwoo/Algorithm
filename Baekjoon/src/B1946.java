import java.util.Scanner;

public class B1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 테스트 케이스 갯수
        int k; // 지원자의 수
        int [] arr;

        for(int i=0; i<n; i++) {
            k = sc.nextInt();
            arr = new int[k+1];

            for (int j = 0; j < k; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[x] = y;
            }

            int standard = arr[1];
            int cnt = 1;

            for(int z=2; z<=k; z++) {
                if(standard > arr[z]) {
                    cnt++;
                    standard = arr[z];
                }
            }

            System.out.println(cnt);
        }
    }
}
