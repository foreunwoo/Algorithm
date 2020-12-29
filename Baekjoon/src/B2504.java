import java.util.Scanner;
import java.util.Stack;

public class B2504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();

        String str = sc.next();
        int result = 0;
        int temp = 1;
        boolean check = true;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '(') {
                s.push(str.charAt(i));
                temp *= 2;
            } else if (str.charAt(i) == '[') {
                s.push(str.charAt(i));
                temp *= 3;
            } else if (str.charAt(i) == ')') {
                if (s.isEmpty() || s.peek() != '(') {
                    check = false;
                    break;
                }
                if (str.charAt(i-1) == '(')
                    result += temp;
                s.pop();
                temp /= 2;
            } else if (str.charAt(i) == ']') {
                if (s.isEmpty() || s.peek() != '[') {
                    check = false;
                    break;
                }
                if (str.charAt(i-1) == '[')
                    result += temp;
                s.pop();
                temp /= 3;
            }
        }

        if (check) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
