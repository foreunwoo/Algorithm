import java.util.Scanner;

public class B2748 {
    static int fib(int n) {
         int [] f = new int[n+1];

         for(int i=0; i<n; i++) { // 배열 f를 0으로 초기화
             f[i] = 0;
         }

         if(n == 1 || n == 2) {
             f[n] = 1;
         } else if(f[n] == 0) {
             return f[n] = fib(n-1) + fib(n-2);
         }

         return f[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
