import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1138 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] left = new int[n+1];
        List<Integer> line = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            left[i] = sc.nextInt(); // 왼쪽에 몇 명이 있는가
        }

        for(int i=n; i>0; i--) {
            line.add(left[i], i);
        }

        for(int a : line) {
            System.out.println(a + " ");
        }

        sc.close();
    }
}
