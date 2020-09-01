import java.util.Scanner;

public class B10872 {

    static int factorial(int n) {
        if(n<=1) {
            return n;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
}


