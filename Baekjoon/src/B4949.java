import java.util.Scanner;
import java.util.Stack;

public class B4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();

        while (true) {
            String str = sc.nextLine();
            if (str.charAt(0) == '.') {
                break;
            }

            char temp;
            boolean ans = true;
            for (int i=0; i<str.length(); i++) {
                temp = str.charAt(i);

                if ('(' == temp || '[' == temp) {
                    s.push(temp);
                } else if (')' == temp) {
                    if (s.isEmpty() || s.pop() != '(') {
                        ans = false;
                        break;
                    }
                } else if (']' == temp) {
                    if (s.isEmpty() || s.pop() != '[') {
                        ans = false;
                        break;
                    }
                }
            }

            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
